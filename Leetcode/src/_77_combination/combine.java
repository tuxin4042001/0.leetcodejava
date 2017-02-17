package _77_combination;

import java.util.ArrayList;
import java.util.List;

public class combine {
    public List<List<Integer>> combine(int n, int k) {
    	List<List<Integer>> result = new ArrayList<List<Integer>>();
    	List<Integer> tempList = new ArrayList<Integer>();
    	getResult(result, tempList, 1, n, k);
    	return result;
    }
    
    public void getResult(List<List<Integer>> result, List<Integer> tempList, int start, int n, int k){
    	//still consider the backtrack method, when you add i, you should also delete i in the tempList
		//tempList.add(i);
		//getResult(result, tempList, i+1, n, k-1);
		//tempList.remove(tempList.size() - 1);
    	if(k == 0){
    		result.add(new ArrayList(tempList));
    		return;
    	}
    	for(int i = start; i <= n; i++){
    		tempList.add(i);
    		getResult(result, tempList, i+1, n, k-1);
    		tempList.remove(tempList.size() - 1);
    	}
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
