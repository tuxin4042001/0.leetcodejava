package _34_searchForARange;

public class searchRange {
	//方法一:双指针方法search
	//     如果nums[start] == target && nums[end] == target, 就表示找到了结果，返回相应值;
	//     如果nums[start] != target, start++向后搜索;
	//     如果nums[end] != target, end--向前收缩;
	//     关键需要初始化result = {-1, -1}
    public int[] searchRange(int[] nums, int target) {
    	int[] result = {-1, -1};
        int start = 0;
        int end = nums.length - 1;
        while(start <= end){
        	if(nums[start] == target && nums[end] == target){
        	    result[0] = start;
        	    result[1] = end;
        		break;
        	}
        	if(nums[start] != target){
        		start++;
        	}
        	if(nums[end] != target){
        		end--;
        	}
        }
        return result;
    }
    
    //方法二:二分查找
    //关键在于使用传统的二分查找,mid = (start + end)/2, nums[mid] < target start = mid, target < nums[mid] end = mid,只能找到数组中target
    //可能是左边界,中间值,右边界,不确定
    //a. 二分法查找左边界: mid = (start + end)/2, nums[mid] <　target start = mid + 1, target <= nums[mid] end = mid
    //b. 二分法查找右边界: mid = (start + end)/2, target < nums[mid] end = mid - 1, target >= nums[mid] start = mid
    public int[] searchRange2(int[] nums, int target) {
    	int[] result = {-1, -1};
    	if(nums.length == 0){
    		return result;
    	}
    	int start = 0; 
    	int end = nums.length - 1;
    	
    	while(start < end){
    		int mid = (start + end)/2;
    		if(nums[mid] < target){
    			start = mid + 1;
    		}else{
    			end = mid;
    		}
    	}
    	if(nums[start] != target){
    		return result;
    	}else{
    		result[0] = start;
    	}
    	
    	end = nums.length - 1;
    	
    	while(start < end){
    		int mid = (start + end)/2 + 1;
    		if(target < nums[mid]){
    			end = mid - 1;
    		}else{
    			start = mid;
    		}
    	}
    	result[1] = end;
    	
    	return result;
        
    }

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}

}
