package _46_permutation;

import java.util.ArrayList;
import java.util.List;

public class permute {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> tempList = new ArrayList<Integer>();
        getResult(result, tempList, nums, 0);
        return result;
    }
    
    public void getResult(List<List<Integer>> result, List<Integer> tempList, int[] nums, int start){
    	if(tempList.size() == nums.length){
    		result.add(new ArrayList(tempList));
    	}else{
        	for(int i = start; i < nums.length; i++){
        		tempList.add(nums[i]);
        		getResult(result, tempList, nums, start);
        		tempList.remove(tempList.size() - 1);
        	}
    	}
    }

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}

}
