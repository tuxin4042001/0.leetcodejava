package _77_combinations;

import java.util.ArrayList;
import java.util.List;

public class combine {
    public List<List<Integer>> combine(int n, int k) {
    	int[] nums = new int[n];
    	for(int i = 0; i < n; i++){
    		nums[i] = i + 1;
    	}
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        List<Integer> tempList = new ArrayList<Integer>();
        backTrack(list, tempList, nums, 0, k);
        return list;
    }
    
    public void backTrack(List<List<Integer>> list, List<Integer> tempList, int[] nums, int start, int length){
    	//就是在找subset的基础上添加了一个长度限制条件
    	if(tempList.size() == length){
    		list.add(new ArrayList<Integer>(tempList));
    	}
    	
    	for(int i = start; i < nums.length; i++){
    		tempList.add(nums[i]);
    		backTrack(list, tempList, nums, i + 1, length);
    		tempList.remove(tempList.size() - 1);
    	}
    }

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}

}
