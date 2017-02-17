package _63_uniquePathII;

public class uniquePathsWithObstacles {
	//解法一: 动态规划解法，关键要注意几个特殊位置
	//       a.obstacleGrid[0][0],如果abs[0][0]为1,动态规划时将其变为0,如果 abs[0][0]为0,动态规划时将其变为1;
	//       b.obstacleGrid[0][j],如果obstacleGrid[0][j]为1，动态规划时将其变为0，如果obstacleGrid[0][j]为0，继承上一个的值obstacleGrid[0][j - 1]
	//       c.obstacleGrid[i][0],如果obstacleGrid[i][0]为1，动态规划时将其变为0，如果obstacleGrid[i][0]为0，继承上一个的值obstacleGrid[i - 1][0]
	//       d.其余的正常处理obstacleGrid[i][j] = (obstacleGrid[i][j] == 1) ? 0 : obstacleGrid[i - 1][j] + obstacleGrid[i][j - 1];九宫法
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if(obstacleGrid.length == 0){
        	return 0;
        }
        
        int m = obstacleGrid.length, n = obstacleGrid[0].length;
        for(int i = 0; i < m; i++){
        	for(int j = 0; j < n; j++){
        		if(i == 0 && j == 0){
        			obstacleGrid[i][j] = (obstacleGrid[i][j] == 1) ? 0 : 1;
        		}else if(i == 0){
        			obstacleGrid[i][j] = (obstacleGrid[i][j] == 1) ? 0 : obstacleGrid[i][j - 1];
        		}else if(j == 0){
        			obstacleGrid[i][j] = (obstacleGrid[i][j] == 1) ? 0 : obstacleGrid[i - 1][j];
        		}else{
        			obstacleGrid[i][j] = (obstacleGrid[i][j] == 1) ? 0 : obstacleGrid[i - 1][j] + obstacleGrid[i][j - 1];
        		}
        	}
        }
        return obstacleGrid[m - 1][n - 1];
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
