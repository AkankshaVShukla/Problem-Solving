class PeakElement {
    public int findPeakElement(int[] nums) {
       return peakElement(nums, 0, nums.length-1);
    }
    
    public int peakElement(int nums[], int start, int end){
        if(start==end){
            return start;
        }else if(start+1==end){
            if(nums[start] > nums[end])return start;
            return end;
        }else{
            int mid=(start+end)/2;
            if(nums[mid-1]<nums[mid] && nums[mid]>nums[mid+1]){
                return mid;
            }else if(nums[mid-1]>nums[mid] && nums[mid]>nums[mid+1]){
                return peakElement(nums, start, mid-1);
            }else{
                return peakElement(nums, mid+1, end);
            }
        }
    }
}
