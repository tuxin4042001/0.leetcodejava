package _90_subset2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subsetsWithDup3_test {
	public static List<List<Integer>> subsetsWithDup(int[] nums) {
		Arrays.sort(nums);
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		List<Integer> tempList = new ArrayList<Integer>();
		boolean[] used = new boolean[nums.length];
		backTrack(list, tempList, nums, used, 0);
		return list;
	}

	public static void backTrack(List<List<Integer>> list, List<Integer> tempList, int[] nums, boolean[] used, int start) {
		list.add(new ArrayList<Integer>(tempList));
		for (int i = start; i < nums.length; i++) {
			//之前的排重采用start区分，if(i = start && nums[i] == nums[i-1])代表纵向重复 1 2 2 中 2 --> 2, 保留；
			//                      if(i >　start && nums[i] == nums[i - 1]代表横向重复 1 2 2 中 2 next 2, 去除；
			//本方法类似permutation, 使用boolean[] used数组排除重复, if(i > start && nums[i] == nums[i - 1] && !used[i]代表横向重复，去除；
			//if(used[i]) + backTrack(list, tempList, nums, used, i) 等价于 backTrack(list, tempList, nums, used, i+1),使得向后移动                  
			if (used[i] || i > start && nums[i] == nums[i - 1] && !used[i])
				continue;

			tempList.add(nums[i]);
			System.out.println("tempList add nums[i]: " + nums[i]);
			System.out.print("tempList: ");
			for (int l : tempList) {
				System.out.print(l + "=> ");
			}
			System.out.println();
			used[i] = true;
			backTrack(list, tempList, nums, used, i);
			tempList.remove(tempList.size() - 1);
    		System.out.println("tempList remove nums[i]: " + nums[i]);
    		System.out.print("tempList: ");
    		for(int l : tempList){
    			System.out.print(l + "=> ");
    		}
    		System.out.println();
			used[i] = false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1, 2, 2};
		subsetsWithDup(nums);

	}

}
