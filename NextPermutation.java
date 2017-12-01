//https://leetcode.com/problems/next-permutation/description/
class NextPermutation {
    public void nextPermutation(int[] nums) {
        int i=0;
        for(i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                break;
            }
        }
        
        //swap
        if(i!=-1){
            for(int j=nums.length-1;j>i;j--){
                if(nums[j]>nums[i]){
                    int temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                    break;
                }
            }       
        }
        //reverse
        i=i+1;
        int j=nums.length-1;
        while(i<j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
       
    }
    
  
}
