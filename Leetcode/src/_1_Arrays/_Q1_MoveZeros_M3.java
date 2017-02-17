package _1_Arrays;
//双指针压缩法
//https://segmentfault.com/a/1190000003768716
public class _Q1_MoveZeros_M3 {
	static int pos = 0;

	public static void moveZeros(int nums[]) {
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				nums[pos] = nums[i];
				pos++;
			}
		}
		for (; pos < nums.length; pos++) {
			nums[pos] = 0;
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
