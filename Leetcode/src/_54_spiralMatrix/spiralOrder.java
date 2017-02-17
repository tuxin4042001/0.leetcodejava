package _54_spiralMatrix;

import java.util.ArrayList;
import java.util.List;

public class spiralOrder {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<Integer>();
        if(matrix.length == 0){
        	return result;
        }
        //rowBegin代表纵排，colBegin代表横排
        int rowBegin = 0, rowEnd = matrix.length - 1;
        int colBegin = 0, colEnd = matrix[0].length - 1;
        while(rowBegin <= rowEnd && colBegin <= colEnd){
        	//首先�?�移, at first traverse right direction
        	for(int i = colBegin; i <= colEnd; i++){
        		result.add(matrix[rowBegin][i]);
        	}
        	rowBegin++;
        	
        	//然�?�下移， and then traverse down direction
        	for(int j = rowBegin; j <= rowEnd; j++){
        		result.add(matrix[j][colEnd]);
        	}
        	colEnd--;
        	
        	//然�?��?�左移，但是�?先判断确定至少行与行�?�?�?�，�?然没有必�?移动
        	if(rowBegin <= rowEnd){
        		for(int k = colEnd; k >= colBegin; k--){
        			result.add(matrix[rowEnd][k]);
        		}
        	}
        	rowEnd--;
        	
        	//然�?��?�上移，但是�?先判断确定至少列与列�?�?�?�，�?然没有必�?移动
        	if(colBegin <= colEnd){
        		for(int l = rowEnd; l >= rowBegin; l--){
        			result.add(matrix[l][colBegin]);
        		}
        	}
        	colBegin++;
        }
        return result;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
