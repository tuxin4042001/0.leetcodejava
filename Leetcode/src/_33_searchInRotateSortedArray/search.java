package _33_searchInRotateSortedArray;

public class search {
	//�ⷨһ: ˫ָ��ⷨ, ˫ָ��ɨ��
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
    
    //�ⷨ��: ���ַ����
    //      a. ����Ĺؼ��������, rotate sorted array����һ����sorted��, ���� 5 6 0 [1] 2 3 4 (��벿��sorted), ���� 1 2 3 [4] 5 6 0 (ǰ�벿��sorted)
    //      b. �������Ϸ���, �Ϳ���֪��target���İ벿����, Ȼ����ַ�����, ����С��Χ, ֱ�� nums[mid] == target return mid 
    //         ����: 1 2 3 [4] 5 6 0, target = 3
    //         ��� nums[start] <= nums[mid], ˵����벿��sorted
    //         ��� nums[start] <= target <= nums[mid], target����벿��, ����벿�ֲ���end = mid - 1, ��֮���Ұ벿�ֲ���, start = mid + 1
    //         ����: 1 [2] 3
    //         nums[start] <= nums[mid], nums[mid] <= target <= nums[end], start = mid + 1
    //         ����: [3]
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
		// TODO �Զ����ɵķ������

	}

}
