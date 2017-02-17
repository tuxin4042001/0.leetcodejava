package _34_searchForARange;

public class searchRange {
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1,-1};
        if(nums.length == 0){
        	return result;
        }
        for(int i = 0; i < nums.length; i++){
        	if(nums[i] == target){
        		result[0] = i;
        		break;
        	}
        }
        for(int i = nums.length - 1; i > result[0]; i--){
        	if(nums[i] == target){
        		result[1] = i;
        		break;
        	}
        }
        return result;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
