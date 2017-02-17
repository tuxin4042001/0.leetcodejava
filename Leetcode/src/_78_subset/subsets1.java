package _78_subset;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subsets1 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> tempList = new ArrayList<Integer>();
        getResult(result, tempList, nums, 0);
        return result;
    }
    //subset跟permutation不一样:
    //① subset可以是任意长度 list.add(new ArrayList(tempList)), permutation必须是tempList.size() == nums.length, 方可list.add(new ArrayList(tempList))
    //② 由于subset的本质是任意长度组合, 所以其for循环int i = start, backTrack(list, tempList, nums, i+1)移动
    //  由于permutation本质是固定长度排列，所以其for循环int i = 0, 通过设定条件如何tempList.contains(nums[i])或者boolean used[i]来移动
    public void getResult(List<List<Integer>> result, List<Integer> tempList, int[] nums, int start){
    	result.add(new ArrayList<Integer>(tempList));
    	
    	for(int i = start; i < nums.length; i++){
    		tempList.add(nums[i]);
    		getResult(result, tempList, nums, i+1);
    		tempList.remove(tempList.size() - 1);
    	}
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
