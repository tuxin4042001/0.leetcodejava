package _40_combinationSumII;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class combinationSumII {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
    	Arrays.sort(candidates);
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        List<Integer> tempList = new ArrayList<Integer>();
        backTrack(list, tempList, candidates, target, 0);
        return list;
    }
    
    public void backTrack(List<List<Integer>> list, List<Integer> tempList, int[] candidates, int target, int start){
    	if(target < 0) return;
    	if(target == 0){
    		list.add(new ArrayList<Integer>(tempList));
    	}
    	for(int i = start; i < candidates.length; i++){
    		if(i > start && candidates[i] == candidates[i - 1]) continue;
    		tempList.add(candidates[i]);
    		backTrack(list, tempList, candidates, target - candidates[i], i+1);
    		tempList.remove(tempList.size() - 1);
    	}
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
