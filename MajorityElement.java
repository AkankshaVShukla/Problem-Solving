//https://leetcode.com/problems/majority-element/description/
class MajorityElement {
    public int majorityElement(int[] nums) {
        int max=0;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int num :nums){
            if(map.containsKey(num)){
                map.put(num, map.get(num)+1);
            }else{
                map.put(num, 1);
            }
            max=Math.max(max, map.get(num));

        }
        
        for(int num :nums){
            if(map.get(num)==max){
                return num;
            }
        }
        return -1;
    }
}
