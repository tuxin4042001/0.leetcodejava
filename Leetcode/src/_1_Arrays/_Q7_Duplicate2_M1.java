package _1_Arrays;

import java.util.HashSet;
import java.util.Iterator;

public class _Q7_Duplicate2_M1 {
	public static boolean containsNearbyDuplicate(int[] nums, int k) {
		HashSet<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (!set.add(nums[i])) {
				return true;
			}
			// ȷ��set����ʼ�ձ���k��Ԫ�أ����������ӣ��ͼ�����i-k��Ԫ�أ�
			if (set.size() == k + 1) {
				set.remove(nums[i - k]);
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int[] nums = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 3, 4 };
		int k = 8;
		System.out.print(containsNearbyDuplicate(nums, k));

	}

}
