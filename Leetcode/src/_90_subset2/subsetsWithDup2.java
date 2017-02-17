package _90_subset2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subsetsWithDup2 {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
    	Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> tempList = new ArrayList<Integer>();
        backTrack(result, tempList, nums, 0);
        return result;
    }
    
    //由于subsetsII问题本质还是找子集, 是组合问题, 还是考虑for(int i = start; ; )结合 i+1, 不用像permutation一样全循环for(int i = 0; ;)
    //这里是排除重复,有两种可能的重复, 第一种是横向重复 1 2 2 中 2 next 2, i > start && nums[i] == nums[i - 1]
    //                             第二种是纵向重复 1 2 2 中 2 --> 2, i = start && nums[i] == nums[i - 1]
    //这里用if(i > start && nums[i] == nums[i - 1])排除第一种横向重复
    public void backTrack(List<List<Integer>> result, List<Integer> tempList, int[] nums, int start){
    	result.add(new ArrayList<Integer>(tempList));
    	for(int i = start; i < nums.length; i++){
    		if(i > start && nums[i] == nums[i - 1]) continue;
    		tempList.add(nums[i]);
    		backTrack(result, tempList, nums, i+1);
    		tempList.remove(tempList.size() - 1);
    	}
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
