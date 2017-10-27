import java.util.LinkedList;
import java.util.Queue;


public class TopologicalSort {

	public static void main(String args[]){
		int[][] prereq = {{1,0},{0,1}};
		System.out.println(topological(2, prereq));
	}
	
	public static boolean topological(int courses, int[][] prereq){
		int[] indegree = new int[courses];
		for(int i=0;i<prereq.length;i++){
			indegree[prereq[i][1]]++;
		}
		Queue<Integer> q = new LinkedList<Integer>();
		for(int i=0;i<courses;i++){
			if(indegree[i]==0){
				q.offer(i);
			}
		}
		while(!q.isEmpty()){
			int a = q.poll();
			for(int i=0;i<prereq.length;i++){
				if(prereq[i][0]==a){
					int y = prereq[i][1];
					indegree[y]--;
					q.offer(y);
				}				
			}
		}
		
		for(int i=0;i<indegree.length;i++){
			if(indegree[i]!=0) return false;
		}
		return true;
	}
}
