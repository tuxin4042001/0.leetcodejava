package _1_Arrays;

public class _Q4_RemoveElement_M1 {
	public static int removeElement(int[] nums, int val) {
		int j = 0;
		int count = 0;
		for(int k=0;k<nums.length;k++){
			if(nums[k]==val){
				count++;
			}
		}
		int[] nums2 = new int[nums.length-count];
		for (int i=0; i < nums.length; i++) {
			if (nums[i] != val) {
				nums2[j] = nums[i];
				j++;
			}
		}
		return nums2.length;
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[] nums=new int[] {1,0,2,0,3,5,0};
		int val = 0;
		int result = removeElement(nums, val);
		System.out.println(result);

	}

}
