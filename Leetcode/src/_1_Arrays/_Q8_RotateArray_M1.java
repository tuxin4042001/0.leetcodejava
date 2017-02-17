package _1_Arrays;

public class _Q8_RotateArray_M1 {
	public static void rotate(int[] nums, int k) {
		int[] nums2 = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {

			nums2[(i + k) % nums.length] = nums[i];

		}
		nums = nums2;
		for (int i : nums) {
			System.out.print(i);
		}
	}

	public static void main(String[] args) {
		int[] nums = new int[] { 1, 2 };
		int k = 1;
		rotate(nums, k);
	}

}
