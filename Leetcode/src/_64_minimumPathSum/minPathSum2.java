package _64_minimumPathSum;

public class minPathSum2 {
	//解法一：动态规划解法，九宫格解法
	//      a.对于grid[0][0], 不变, 不去管它就可以；
	//      b.对于第一行grid[0][j], 积累上去, grid[i][j] += grid[i][j - 1];
	//      c.对于第一列grid[i][0], 积累上去, grid[i][j] += grid[i - 1][j];
	//      d.对于其他元素, 取最小值累加, grid[i][j] += Math.min(grid[i - 1][j], grid[i][j - 1]);
    public int minPathSum(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        for(int i = 0; i < m; i++){
        	for(int j = 0; j < n; j++){
        		if(i == 0 && j > 0){
        			grid[i][j] += grid[i][j - 1];
        		}else if(j == 0 && i > 0){
        			grid[i][j] += grid[i - 1][j];
        		}else if(i > 0 && j > 0){
        			grid[i][j] += Math.min(grid[i - 1][j], grid[i][j - 1]);
        		}
        	}
        }
        return grid[m - 1][n - 1];
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
