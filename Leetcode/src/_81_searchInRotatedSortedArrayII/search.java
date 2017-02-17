package _81_searchInRotatedSortedArrayII;

public class search {

	//�ⷨһ: ˫ָ�뷽��
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

	//�ⷨ��: ���ַ�, 
	//      a. ����Զ��ͬ31. search in rotate sorted Array I, ֻ����31.��nums[start] <= nums[mid]˵����벿��sorted
	//         �������ﲻ��, ���� 1 3 [1] 1 1 1, nums[start] = nums[mid]˵��������벿��sorted, ������Ҫ�ֳ����ο���
	//         1 3 [1] 1 1 1
	//         nums[start] < nums[mid] => ��벿��sorted, if nums[start] <= target <= nums[mid], ˵��target����벿��, ��֮���Ұ벿��
	//         nums[start] > nums[mid] => �Ұ벿��sorted, if nums[mid] <= target <= nums[end], ˵��target���Ұ벿��, ��֮����벿��
	//         nums[start] == nums[mid], ˵��������벿��sorted�����Ұ벿��sorted, ��Ҫstart++, ���ж�

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
		// TODO �Զ����ɵķ������

	}

}
