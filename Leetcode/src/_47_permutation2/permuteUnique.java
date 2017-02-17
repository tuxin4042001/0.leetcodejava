package _47_permutation2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class permuteUnique {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        List<Integer> tempList = new ArrayList<Integer>();
        boolean[] used = new boolean[nums.length];
        //issue 1: for the duplicate situation, need Arrays.sort(), otherwise if(nums[i] == nums[i-1]) doesn't work
        Arrays.sort(nums);
        backTrack(list, tempList, nums, used);
        return list;
    }
    
    public void backTrack(List<List<Integer>> list, List<Integer> tempList, int[] nums, boolean[] used){
    	if(tempList.size() == nums.length){
    		list.add(new ArrayList(tempList));
    	}
    	for(int i = 0; i < nums.length; i++){
    		if(used[i] || (i > 0 && nums[i] == nums[i - 1] && !used[i - 1])){
    			continue;
    		}else{
    			used[i] = true;
    			tempList.add(nums[i]);
    			backTrack(list, tempList, nums, used);
    			used[i] = false;
    			tempList.remove(tempList.size() - 1);
    		}
    	}
    }

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}

}
