package akanksha.test.LeetCodePractice;

import java.util.HashMap;
import java.util.Map;

class TwoSum {
	public static void main(String args[]){
		int[] a ={1,3,5,2,7};
		System.out.println(twoSum(a,8));
	}
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target - nums[i])){
                result[0]=i;
                result[1]=map.get(target-nums[i]);
                return result;
            }
            map.put(nums[i], i);
        }
        return result;
    }
}