package akanksha.test.LeetCodePractice;

public class RotateArray {
	public static void main(String args[]){
		int[] a={1,2,3,4,5,6,7};
		rotate(a,3);
	}
	public static void rotate(int[] nums, int k) {
        k=k%nums.length;
        if(k==0)return;
        int[] arr=new int[k];
        int j=0;
        for(int i=0;i<k;i++){
            arr[i]=nums[nums.length-k+i];
        }
        for(int i=nums.length-1-k;i>=0;i--){
            nums[i+k]=nums[i];
        }
        for(int i=0;i<arr.length;i++){
            nums[i]=arr[i];
        }
    }
}
