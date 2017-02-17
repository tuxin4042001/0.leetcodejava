package _48_rotateImage;

public class rotate {
    public void rotate(int[][] matrix) {
    	int temp = 0;
    	//九十度顺时针旋转等于两次旋转：
    	//a.matrix[i][j] = matrix[j][i]
    	//b.matrix[i][j] = matrix[i][matrix[i].length - 1 - j]
    	for(int i = 0; i < matrix.length; i++){
    		for(int j = i; j < matrix[0].length; j++){
    			temp = matrix[i][j];
    			matrix[i][j] = matrix[j][i];
    			matrix[j][i] = temp;
    		}
    	}
    	
    	for(int i = 0; i < matrix.length; i++){
    		for(int j = 0; j < matrix[0].length/2; j++){
    			temp = matrix[i][j];
    			matrix[i][j] = matrix[i][matrix[0].length - 1 - j];
    			matrix[i][matrix[0].length - 1 - j] = temp;
    		}
    	}
        
    }

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}

}
