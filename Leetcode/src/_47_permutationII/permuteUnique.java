package _47_permutationII;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class permuteUnique {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        List<Integer> tempList = new ArrayList<Integer>();
        Arrays.sort(nums);
        boolean[] used = new boolean[nums.length];
        backTrack(list, tempList, nums, used);
        return list;
    }
    
    public void backTrack(List<List<Integer>> list, List<Integer> tempList, int[] nums, boolean[] used){
    	if(tempList.size() == nums.length){
    		list.add(new ArrayList<Integer>(tempList));
    	}
    	
    	for(int i = 0; i < nums.length; i++){
    		//permutationII,关键就是如何忽略掉已经横向重复的nums[i]
    		//used[i]表示nums[i]已经添加过, 忽略继续添加后面的元素，向后移动
    		//i > 0 && nums[i] == nums[i - 1] && !used[i - 1]
    		//例如： 1 + 1 = 1 1 ==> 1 1 + 2 = 1 1 2
    		//i > 0 && nums[i] == nums[i - 1] && !used[i] 表示横向重复，横向重复不考虑
    		//例如： 1 2 + 1 = 1 2 1 ==> 1 2 1 - 1 = 1 2 ==> 1 2 - 2 = 1 ==> 1 - 1 = "" ==> "" + 2 = 2
    		//如果不忽略重复的nums[i]也可以, 想使用if(tempList.size() == nums.length && !list.contains(new ArrayList(tempList)), 但是会超时
    		if(used[i] || i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) continue;
    		tempList.add(nums[i]);
    		used[i] = true;
    		backTrack(list, tempList, nums, used);
    		tempList.remove(tempList.size() - 1);
    		used[i] = false;
    	}
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
