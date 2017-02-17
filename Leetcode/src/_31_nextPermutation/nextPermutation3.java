package _31_nextPermutation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class nextPermutation3 {
    public static void nextPermutation(int[] nums) {
    	int[] nums_temp = new int[nums.length];
    	for(int i = 0; i < nums.length; i++){
    		nums_temp[i] = nums[i];
    	}
    	List<List<Integer>> list = permute(nums_temp);
    	
    	List<Integer> tempList = new ArrayList<Integer>();
    	for(int i = 0; i < nums.length; i++){
    		tempList.add(nums[i]);
    	}
    	
    	int index = list.indexOf(new ArrayList<Integer>(tempList));
    	
    	if(index == list.size() - 1){
    		for(int i = 0; i < list.get(0).size(); i++){
    			nums[i] = list.get(0).get(i);
    		}
    	}else{
    		for(int i = 0; i < list.get(index + 1).size(); i++){
        		nums[i] = list.get(index + 1).get(i);
    		}
    	}
    }
    
    public static List<List<Integer>> permute(int[] nums){
    	Arrays.sort(nums);
    	List<List<Integer>> list = new ArrayList<List<Integer>>();
    	List<Integer> tempList = new ArrayList<Integer>();
    	boolean[] used = new boolean[nums.length];
    	backTrack(list, tempList, nums, used);
    	return list;
    }
    
    public static void backTrack(List<List<Integer>> list, List<Integer> tempList, int[] nums, boolean[] used){
    	if(tempList.size() == nums.length){
    		list.add(new ArrayList<Integer>(tempList));
    	}
    	
    	for(int i = 0; i < nums.length; i++){
    		if(used[i] || i > 0 && nums[i] == nums[i - 1] && !used[i - 1]){
    			continue;
    		}
    		tempList.add(nums[i]);
    		used[i] = true;
    		backTrack(list, tempList, nums, used);
    		tempList.remove(tempList.size() - 1);
    		used[i] = false;
    	}
    }
    
    public static void print(List<List<Integer>> list, int index){
    	List<Integer> tempList = new ArrayList<Integer>();
    	tempList = list.get(index);
    	for(int i : tempList){
    		System.out.print(i + "==>");
    	}
    }

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[] nums = {6,7,5,3,5,6,2,9,1,2,7,0,9};
		nextPermutation(nums);
		for(int i : nums) System.out.print(i + "==>");
	}

}
