package _35_searchInsertPosition;

public class searchInsert {
	//����һ: ���ö��ַ��ҵ���߽�, Ȼ���ж�target�÷ŵ�����, nums[start] < target, �ŵ�start�ұ�, nums[start] > target, �ŵ�start���
    public int searchInsert(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        while(start < end){
        	int mid = (start + end)/2;
        	if(nums[mid] < target){
        		start = mid + 1;
        	}else{
        		end = mid;
        	}
        }
        if(nums[start] < target){
        	return start + 1;
        }else{
        	return start;
        }
    }

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������

	}

}
