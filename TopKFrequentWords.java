import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;


public class TopKFrequentWords {
	public List<String> topKFrequent(String[] words, int k) {
        List<String> output = new ArrayList<String>();
        Map<String, Integer> map=new HashMap<String, Integer>();
        for(String word :words){
            if(map.containsKey(word)){
                map.put(word, map.get(word)+1);
            }else{
                map.put(word, 1);
            }
        } 
        PriorityQueue<Map.Entry<String, Integer>> pq = new PriorityQueue<>(
                (a,b) -> a.getValue()==b.getValue() ? b.getKey().compareTo(a.getKey()) : a.getValue()-b.getValue()
       );
        
        for(Map.Entry<String, Integer> entry :map.entrySet()){
            pq.offer(entry);
            if(pq.size()>k) pq.poll();        
        }
        while(!pq.isEmpty()){
            output.add(0, pq.poll().getKey());
        }
        return output;
    }
}
