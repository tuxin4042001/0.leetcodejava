package _63_uniquePath2;

public class uniquePathsWithObstacles2 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] result = new int[m][n];
        for(int i = 0; i < m; i++){
        	for(int j = 0; j < n; j++){
        		if(obstacleGrid[0][0] == 1 || obstacleGrid[m - 1][n - 1] == 1){
        			return 0;
        		}else if(obstacleGrid[i][j] == 1){
        			result[i][j] = 0;
        		}else if(i == 0 || j == 0){
        			result[i][j] = 1;
        		}else{
        			result[i][j] = result[i - 1][j] + result[i][j - 1];
        		}
        	}
        }
        return result[m - 1][n - 1];
    }

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}

}
