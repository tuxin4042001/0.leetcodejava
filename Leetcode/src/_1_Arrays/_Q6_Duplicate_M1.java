package _1_Arrays;

public class _Q6_Duplicate_M1 {
	public static boolean containsDuplicate(int[] nums) {
		//ʹ��һ������ֵ����������ݳ�2��forѭ��������ʵ��return�����
		boolean result = false;
		if (nums.length <= 1) {
			System.out.println("step1: result false");
			result = false;
		} else {
			for (int i = 0; i < nums.length; i++) {
				if(result==true){
					break;
				}
				for (int j = i + 1; j < nums.length; j++) {
					if (nums[i] == nums[j]) {
						System.out.println("step2: result true");
						result = true;
						break;
					} else {
						System.out.println("step3: result false");
						result = false;
					}
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int[] nums = new int[] { 1, 2, 3, 4, 3, 26, 7 };
		System.out.println(containsDuplicate(nums));

	}

}
