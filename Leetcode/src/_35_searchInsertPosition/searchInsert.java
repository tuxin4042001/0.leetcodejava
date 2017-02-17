package _35_searchInsertPosition;

public class searchInsert {
	//方法一: 采用二分法找到左边界, 然后判断target该放到哪里, nums[start] < target, 放到start右边, nums[start] > target, 放到start左边
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
		// TODO 自动生成的方法存根

	}

}
