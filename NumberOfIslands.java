package akanksha.test.LeetCodePractice;

public class NumberOfIslands {
	public static void main(String args[]){
		int[][] grid={{1,1,0,0,0},
					  {1,1,0,0,0},
					  {0,0,1,0,0},
					  {0,0,0,1,1}
				};
		System.out.println(countIslands(grid));
	}
	public static int countIslands(int[][] grid){
		int count=0;
		int m = grid.length;
		int n = grid[0].length;
		boolean[][] visited=new boolean[m][n];
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				if(grid[i][j]==1 && visited[i][j]==false){
					dfs(grid, i, j, visited);
					count++;
				}
			}
		}
		return count;
	}
	
	public static void dfs(int[][] grid, int i, int j, boolean[][] visited){
		if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || visited[i][j]|| grid[i][j]==0){
			return;
		}		
		visited[i][j]=true;
		dfs(grid, i-1, j, visited);
		dfs(grid, i+1, j, visited);
		dfs(grid, i, j-1,visited);
		dfs(grid, i, j+1, visited);
	}
}
