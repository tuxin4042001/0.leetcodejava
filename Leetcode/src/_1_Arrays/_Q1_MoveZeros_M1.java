package _1_Arrays;

import java.util.Arrays;

public class _Q1_MoveZeros_M1 {
	public static void moveZeros(int[] nums) {
		int count = 0;
		Arrays.sort(nums);
		for (int i : nums) {
			if (i == 0) {
				count++;
			} else {
				break;
			}
		}
		int[] a1 = new int[nums.length];
		for (int i = 0; i < (nums.length - count); i++) {
			a1[i] = nums[count + i];
		}
		for (int i = 0; i < count; i++) {
			a1[nums.length - count] = 0;
		}
		nums = a1;
		for (int i : nums) {
			System.out.print(i);
		}
	}

	public static void main(String[] args) {
		int[] a1 = new int[] { 1, 0, 2, 0, 3, 6 };
		moveZeros(a1);
		int count = 0;

	}

}
