
public class MissingNumber {
	
	public static void main(String args[]){
		int[] a={2,1,5,3,0,4};
		System.out.println(missing(a));
		System.out.println(missingxor(a));
		
	}
	public static int missing(int nums[]){
		int len= nums.length;
		int total = len * (len+1)/2;
		int sum=0;
		for(int i=0;i<nums.length;i++){
			sum+=nums[i];
		}
		return total-sum;
	}
	
	public static int missingxor(int nums[]){
		int xor=0,i=0;
		for(i=0;i<nums.length;i++){
			xor=xor^i^nums[i];
		}
		return xor^i;
	}
}
