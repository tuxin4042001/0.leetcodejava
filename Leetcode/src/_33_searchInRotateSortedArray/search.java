package _33_searchInRotateSortedArray;

public class search {
	//解法一: 双指针解法, 双指针扫描
    public int search(int[] nums, int target) {
        if(nums.length == 0){
        	return -1;
        }
        
        int start = 0, end = nums.length - 1;
        while(start <= end){
        	if(nums[start] == target || nums[end] == target){
        		return (nums[start] == target) ? start : end;
        	}
        	start++;
        	end--;
        }
        return -1;
    }
    
    //解法二: 二分法求解
    //      a. 解题的关键在于理解, rotate sorted array总有一般是sorted的, 例如 5 6 0 [1] 2 3 4 (后半部分sorted), 例如 1 2 3 [4] 5 6 0 (前半部分sorted)
    //      b. 基于以上分析, 就可以知道target在哪半部分了, 然后二分法查找, 逐渐缩小范围, 直至 nums[mid] == target return mid 
    //         例子: 1 2 3 [4] 5 6 0, target = 3
    //         如果 nums[start] <= nums[mid], 说明左半部分sorted
    //         如果 nums[start] <= target <= nums[mid], target在左半部分, 在左半部分查找end = mid - 1, 反之在右半部分查找, start = mid + 1
    //         进化: 1 [2] 3
    //         nums[start] <= nums[mid], nums[mid] <= target <= nums[end], start = mid + 1
    //         进化: [3]
    //         nums[mid] == 3, return mid
    public int search2(int[] nums, int target) {
        if(nums.length == 0){
        	return -1;
        }
        
        int start = 0, end = nums.length - 1;
        while(start < end){
        	int mid = (start + end)/2;
        	if(nums[mid] == target){
        		return mid;
        	}
        	
        	if(nums[start] <= nums[mid]){
        		if(nums[start] <= target && target <= nums[mid]){
        			end = mid - 1;
        		}else{
        			start = mid + 1;
        		}
        	}else{
        		if(nums[mid] <= target && target <= nums[end]){
        			start = mid + 1;
        		}else{
        			end = mid - 1;
        		}
        	}
        }
        return nums[start] == target ? start : -1;
    }

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}

}
