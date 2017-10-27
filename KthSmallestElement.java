package akanksha.test.LeetCodePractice;

public class KthSmallestElement {
	public static void main(String args[]){
		int[] nums={3,5,2,8,9};
		System.out.println(kSmallest(nums,0, nums.length-1, 3));
	}
	public static int kSmallest(int nums[], int start, int end, int k){
		if(start<end){
			int pivot=partition(nums, start, end);	
			if(pivot>k){
				kSmallest(nums, start, pivot-1, k);
			}else if(pivot < k){
				kSmallest(nums, pivot+1, end, k);
			}
		}else{
			return -1;
		}
		return nums[k-1];
	}
	
	public static int partition(int[] nums, int start, int end){
		int i=start;
		int j =end;
		while(i<j){
			while(i<nums.length && nums[start]>nums[i]){
				i++;
			}
			while(j>=0 && nums[start]<nums[j]){
				j--;
			}
			if(i<j){
				int temp=nums[i];
				nums[i]=nums[j];
				nums[j]=temp;
			}else{
				break;
			}
		}
		int temp=nums[j];
		nums[j]=nums[start];
		nums[start]=temp;
		return j;

	}
}

