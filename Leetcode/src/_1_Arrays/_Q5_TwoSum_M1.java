package _1_Arrays;

import java.util.ArrayList;
import java.util.List;

//本题的关键在于只要找到第一个符合条件的两个数的index即可，不是说要找到所有符合条件的两个数
public class _Q5_TwoSum_M1 {
	public static int[] twoSum(int[] nums, int target) {
		int[] nums2 = new int[2];
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					nums2[0] = i;
					nums2[1] = j;
					System.out.print(nums2[0] + " " + nums2[1]);
					System.out.println();
					break;
				}
			}

		}
		return nums2;

	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[] nums = new int[] { 1, 2, 3, 6, 7, 8 };
		int target = 9;
		twoSum(nums, target);
	}

}
