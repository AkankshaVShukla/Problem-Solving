package akanksha.test.LeetCodePractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ShortestSubArray {
	public static void main(String args[]){
		int a[]={1,2,2,3,1,4,2};
		System.out.println(findShortestSubArray(a));
	}
	 public static int findShortestSubArray(int[] nums) {
	        Map<Integer, ArrayList<Integer>> map=new HashMap<Integer, ArrayList<Integer>>();
	        for(int i=0;i<nums.length;i++){
	            if(!map.containsKey(nums[i])){
	                ArrayList<Integer> indexes=new ArrayList<Integer>();
	                indexes.add(1);
	                indexes.add(i);
	                indexes.add(i);
	                map.put(nums[i], indexes);
	            }else{
	                ArrayList<Integer> indexes=map.get(nums[i]);
	                indexes.set(0, indexes.get(0)+1);
	                indexes.set(2,i);
	                map.put(nums[i], indexes);
	            }
	            
	        }
	        int maxDegree=0;
	        Map<Integer, Integer> degreeRange=new HashMap<Integer, Integer>();
	        
	        for(int key: map.keySet()){
	            ArrayList<Integer> list=map.get(key);
	            int degree=list.get(0);
	            int range=list.get(2)-list.get(1)+1;
	            if(degree>=maxDegree){
	            	maxDegree=degree;
	            	if(degreeRange.containsKey(degree) && degreeRange.get(degree)<range){
	            		continue;
	            	}
	            	degreeRange.put(degree, range);
	            }
	        }
	        return degreeRange.get(maxDegree);
	        
	    }
}
