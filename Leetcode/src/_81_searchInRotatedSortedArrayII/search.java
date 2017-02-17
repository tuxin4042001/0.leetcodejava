package _81_searchInRotatedSortedArrayII;

public class search {

	//解法一: 双指针方法
	public boolean search(int[] nums, int target) {
		if (nums.length == 0) {
			return false;
		}

		int start = 0, end = nums.length - 1;
		while (start < end) {
			if (nums[start] == target || nums[end] == target) {
				return true;
			}
			start++;
			end--;
		}
		return nums[start] == target ? true : false;
	}

	//解法二: 二分法, 
	//      a. 基本远离同31. search in rotate sorted Array I, 只不过31.中nums[start] <= nums[mid]说明左半部分sorted
	//         但是这里不行, 例如 1 3 [1] 1 1 1, nums[start] = nums[mid]说明不了左半部分sorted, 这里需要分成三段考虑
	//         1 3 [1] 1 1 1
	//         nums[start] < nums[mid] => 左半部分sorted, if nums[start] <= target <= nums[mid], 说明target在左半部分, 反之在右半部分
	//         nums[start] > nums[mid] => 右半部分sorted, if nums[mid] <= target <= nums[end], 说明target在右半部分, 反之在左半部分
	//         nums[start] == nums[mid], 说明不了左半部分sorted或者右半部分sorted, 需要start++, 再判断

	public boolean search2(int[] nums, int target) {
		if (nums.length == 0) {
			return false;
		}

		int start = 0, end = nums.length - 1;
		while (start < end) {
			int mid = (start + end) / 2;
			if (nums[mid] == target) {
				return true;
			}
			if (nums[start] < nums[mid]) {
				if (nums[start] <= target && target <= nums[mid]) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			} else if(nums[start] > nums[mid]){
				if(nums[mid] <= target && target <= nums[end]){
					start = mid + 1;
				}else {
					end = mid - 1;
				}
			} else{
				start++;
			}
		}
		return nums[start] == target ? true : false;
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}

}
