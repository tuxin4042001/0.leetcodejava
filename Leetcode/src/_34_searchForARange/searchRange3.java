package _34_searchForARange;

public class searchRange3 {
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
        int i = 0, j = nums.length - 1, m = 0;
        //nums[m] == target, 
        while(i < j){
        	m = (i + j)/2;
        	if(nums[m] < target){
        		i = m + 1;
        	}else{
        		j = m;
        	}
        }
        if(nums[i] != target) return result;
        result[0] = i;
        
        j = nums.length - 1;
        while(i < j){
        	m = (i + j)/2 + 1;
        	if(nums[m] < target){
        		j = m - 1;
        	}else{
        		i = m;
        	}
        }
        result[1] = j;
        return result;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
