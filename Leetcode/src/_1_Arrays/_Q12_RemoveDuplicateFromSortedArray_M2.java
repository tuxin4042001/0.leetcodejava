package _1_Arrays;

public class _Q12_RemoveDuplicateFromSortedArray_M2 {
	public static int removeDuplicates(int[] nums) {
		int cur = 0;
		for (int n : nums)
			if (n > nums[cur])
				nums[++cur] = n;
		return cur + 1;
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[] nums = new int[] { 1, 1, 2, 3, 4, 5, 5 };
		int length = removeDuplicates(nums);
		System.out.println(length);
	}
}
