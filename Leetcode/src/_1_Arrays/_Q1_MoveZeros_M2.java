package _1_Arrays;

public class _Q1_MoveZeros_M2 {
	static int count = 0;

	public static void moveZeros(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				count++;
			} else if(count>0) {
				nums[i - count] = nums[i];
				nums[i] = 0;
			}
		}
		for (int i : nums) {
			System.out.print(i);
		}

	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[] a1 = new int[] { 1, 0, 2, 0, 3, 0, 5 };
		moveZeros(a1);
	}

}
