package _73_setMatrixZeros;

public class setZeroes {
	//题解：本题的关键是如果matrix中matrix[i][j] = 0的话，相应行和列都需要置为0；
	//问题1：我们不能一开始就将响应的行列置为0，否则没法进行下去，会导致所有的matrix元素都为0，所以我们要新建row[matrix.length]和col[matrix[0].length]来记录
	//     记录那一行一列应该置为0
	//优化：如果我们新建row[matrix.length]和col[matrix[0].length]的话，我们会占用额外的空间，可以考虑利用matrix[0][j]和matrix[i][0]来保存数据,至于
	//    matrix[0][j]是否置为0和matrix[i][0]是否置为0，利用额外的变量记录；
    public void setZeroes(int[][] matrix) {
        boolean[] row = new boolean[matrix.length];
        boolean[] col = new boolean[matrix[0].length];
        for(int i = 0; i < matrix.length; i++){
        	for(int j = 0; j < matrix[0].length; j++){
        		if(matrix[i][j] == 0){
        			row[i] = true;
        			col[j] = true;
        		}
        	}
        }
        
        for(int i = 0; i < matrix.length; i++){
        	for(int j = 0; j < matrix[0].length; j++){
        		if(row[i]){
        			matrix[i][j] = 0;
        		}
        		
        		if(col[j]){
        			matrix[i][j] = 0;
        		}
        	}
        }
    }

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}

}
