package jingchen;

public class NumberofIslands {
	 public int numIslands(char[][] grid) {
	        if(grid.length == 0)
	            return 0;
	        boolean[][] visited = new boolean[grid.length][grid[0].length];
	        int count = 0;
	            for(int i = 0;i < grid.length;i++)
	                for(int j = 0;j < grid[0].length;j++)
	                    if(grid[i][j] == '1' && visited[i][j] == false){
	                        walk(grid,visited,i,j);
	                        count++;
	                    }
	        return count;
	    }
	    
	    private void walk(char[][] grid, boolean[][] visited,int i, int j){
	        if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || visited[i][j] == true || grid[i][j] == '0')
	            return;
	        else{
	            visited[i][j] = true;
	            walk(grid,visited,i-1,j);
	            walk(grid,visited,i+1,j);
	            walk(grid,visited,i,j+1);
	            walk(grid,visited,i,j-1);
	        }
	    }
}
