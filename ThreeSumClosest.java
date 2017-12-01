//https://leetcode.com/problems/3sum-closest/description/
class ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {       
        Arrays.sort(nums);
        int res=nums[0]+nums[1]+nums[nums.length-1];
        for(int i=0;i<nums.length-2;i++){
            int start=i+1;
            int end=nums.length-1;
            while(start < end){
                int sum =nums[i]+nums[start]+nums[end];
                if(sum<=target){
                    start++;
                }else{
                    end--;
                }
                if(Math.abs(sum-target) < Math.abs(res-target)){
                    res=sum;
                }
            }            
        }
        return res;
    }
}
