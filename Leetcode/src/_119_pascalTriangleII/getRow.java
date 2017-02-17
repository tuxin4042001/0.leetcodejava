package _119_pascalTriangleII;

import java.util.ArrayList;
import java.util.List;

public class getRow {
	//解法一:跟求解118一样，就是需要设置一个tempList记录上一个result的值
    public List<Integer> getRow(int rowIndex) {
        List<Integer> tempList = new ArrayList<Integer>();
        List<Integer> result = new ArrayList<Integer>();
        for(int i = 0; i <= rowIndex; i++){
        	if(i <= 1){
        		result.add(0, 1);
        		result.set(i, 1);
        		tempList = new ArrayList<Integer>(result);
        	}else{
        		result.add(0, 1);
        		result.set(i, 1);
        		for(int j = 1; j < i; j++){
        			result.set(j, tempList.get(j - 1) + tempList.get(j));
        		}
        		tempList = new ArrayList<Integer>(result);
        		
        	}
        }
        return result;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
