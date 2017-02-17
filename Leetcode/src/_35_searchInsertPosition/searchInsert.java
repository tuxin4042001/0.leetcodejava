package _35_searchInsertPosition;

public class searchInsert {
    public int searchInsert(int[] nums, int target) {
        int i = 0, j = nums.length - 1, m = 0;
        while(i <= j){
        	m = (i + j)/2;
        	if(nums[m] == target){
        		return m;
        	}else if(nums[m] < target){
        		i = m + 1;
        	}else{
        		j = m - 1;
        	}
        }
        return i;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
