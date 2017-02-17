package _1_Arrays;

import java.util.HashSet;
import java.util.Set;

public class _Q12_RemoveDuplicateFromSortedArray_M1 {

	public static int removeDuplicates(int[] nums) {
		Set<Integer> se = new HashSet<Integer>();
		for (int i = 0; i < nums.length; i++) {
			se.add(nums[i]);
		}
		return se.size();
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[] nums = new int[] { 1, 1, 2, 3, 4, 5, 5 };
        int length = removeDuplicates(nums);
        System.out.println(length);
	}

}
