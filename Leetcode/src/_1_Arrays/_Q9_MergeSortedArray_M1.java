package _1_Arrays;

import java.sql.Array;
import java.util.Arrays;

public class _Q9_MergeSortedArray_M1 {
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		int[] nums3 = new int[nums1.length+nums2.length];
		//如何合并两个arrays
		//http://blog.csdn.net/jaycee110905/article/details/9179227
		System.arraycopy(nums1, 0, nums3, 0, nums1.length);
		System.arraycopy(nums2, 0, nums3, nums1.length, nums2.length);
		Arrays.sort(nums3);
		for (int i : nums3) {
			System.out.print(i);
		}
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[] nums1 = new int[] { 0 };
		int[] nums2 = new int[] { 1 };
		int m = 0;
		int n = 1;
		merge(nums1, m, nums2, n);

	}

}
