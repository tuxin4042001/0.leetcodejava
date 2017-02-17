package _64_minimumPathSum;

public class minPathSum {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        //method1:九宫格算法
        for(int i = 0; i < m; i++){
        	for(int j = 0; j < n; j++){
        		//更新左上角元素，等于自身不变
        		if(i == 0 && j == 0) grid[i][j] = grid[i][j];
        		//更新计算第一行所有元素的值
        		else if(i == 0 && j != 0) grid[i][j] = grid[i][j - 1] + grid[i][j];
        		//更新计算第一列所有元素的值
        		else if(i != 0 && j == 0) grid[i][j] = grid[i - 1][j] + grid[i][j];
        		//更新其余元素, 其值为Math.Min(grid[i - 1][j], grid[i][j - 1])加其值
        		else grid[i][j] = Math.min(grid[i -1][j], grid[i][j - 1]) + grid[i][j];
        	}
        }
        return grid[m - 1][n - 1];
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
