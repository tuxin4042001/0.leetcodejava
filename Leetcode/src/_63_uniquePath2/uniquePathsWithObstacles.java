package _63_uniquePath2;

import java.io.Console;

public class uniquePathsWithObstacles {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int row = obstacleGrid.length;
        int col = obstacleGrid[0].length;
        int[][] result = new int[row][col];
        
        //关键在理取异，a = 0, b = 1, a ^ b = 1
        result[0][0] = (obstacleGrid[0][0] ^= 1);
        for(int i = 1; i < col; i++){
        	result[0][i] = (obstacleGrid[0][i] == 1)? 0 : result[0][i - 1];
        }
        
        for(int i = 1; i < row; i++){
        	result[i][0] = (obstacleGrid[i][0] == 1)? 0 : result[i - 1][0];
        }
        
        for(int i = 1; i < row; i++){
        	for(int j = 1; j < col; j++){
        		result[i][j] = (obstacleGrid[i][j] == 1)? 0 : result[i - 1][j] + result[i][j - 1];
        	}
        }
        
        return result[row - 1][col - 1];
    }

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int i = 0;
		int j = 1;
		int k = i ^ j;
		System.out.println(k);

	}

}
