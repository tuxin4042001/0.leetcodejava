package _90_subset2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subsetsWithDup1 {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
    	Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> tempList = new ArrayList<Integer>();
        backTrack(result, tempList, nums, 0);
        return result;
    }
    
    public void backTrack(List<List<Integer>> result, List<Integer> tempList, int[] nums, int start){
    	List<Integer> tempList2 = new ArrayList<Integer>(tempList);
    	//isuue1: how to avoid duplicates, if result contains tempList, so don't add the tempList into result
    	//problem1: this method will search each possible subset, and then eliminate the already exist subset, it will take time, out of time limit
    	if(!result.contains(tempList2)){
    		result.add(tempList2);
    	}
    	for(int i = start; i < nums.length; i++){
    		tempList.add(nums[i]);
    		backTrack(result, tempList, nums, i + 1);
    		tempList.remove(tempList.size() - 1);
    	}
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
