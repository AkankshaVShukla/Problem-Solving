import java.util.ArrayList;


public class LongestIncreasingSubsequence {
	public static void main(String args[]){
		int[] a ={10,9,2,5,3,7,101,18};
		lss(a);
	}
	public static int lss(int a[]){
		if(a==null)return 0;
		int max=1;
		int[] dp = new int[a.length];
		dp[0]=1;
		for(int i=1;i<a.length;i++){
			int maxTemp=1;
			for(int j=0;j<i;j++){
				if(a[j]<a[i]){
					maxTemp=Math.max(maxTemp, dp[j]);
				}
			}
			dp[i]= maxTemp+1;
		}
		
		for(int i=0;i<a.length;i++){
			max=Math.max(max, dp[i]);
		}
		return max;
	}
}
