package _1_Arrays;

import java.util.Arrays;
import java.util.HashSet;

public class _Q6_Duplicate_M3 {

	public static boolean containsDuplicate(int[] nums) {
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i=0;i<nums.length;i++){
			if(!set.add(nums[i])){
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[] nums = new int[] { 1, 2, 3, 4, 3, 26, 7 };
		System.out.println(containsDuplicate(nums));

	}

}
