package _26_removeDuplicateFromSortedArray;

//��⣺����һ��sorted����int[] nums, ɾ�����е��ظ�Ԫ�ز������������򣬷�����������������ĳ���
//���ӣ�{1,1,2} --> {1,2,2} result = 2
//�ؼ����趨����index, index i��ǰ�����������int[] nums, index start��¼��ǰ�����λ��
//    �����ַ����ж�˾�����Ԫ��: a. i > 0 && nums[i] != nums[i - 1]; b. i > 0 && nums[i] > nums[i - 1]
//    ֮���Կ���ʹ�õڶ��ַ�������Ϊint[] nums��sorted��
public class removeDuplicates {
    public static int removeDuplicates(int[] nums) {
    	if(nums.length < 2)
    		return nums.length;
    	
        int start = 1;
        for(int i = 1; i < nums.length; i++){
        	if(nums[i] != nums[i - 1]){
            	nums[start++] = nums[i];
        	}
        }
        return start;
    }

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int[] nums = {1,1};
		int i = removeDuplicates(nums);
        System.out.printf("length of the result is: %d %n", i);
        for(int n: nums){
        	System.out.print(n);
        }
	}

}
