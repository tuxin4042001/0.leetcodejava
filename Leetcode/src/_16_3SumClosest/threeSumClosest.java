package _16_3SumClosest;

import java.util.Arrays;

public class threeSumClosest {
	public int threeSumClosest(int[] nums, int target){
		Arrays.sort(nums);
		int result = 0;
		if(nums.length <= 3){
			for(int num : nums){
				result += num;
	        }
	        return result;
	    }
	    
		result = nums[0] + nums[1] + nums[2];
		for(int i = 0; i < nums.length; i++){
			int start = i + 1;
			int end = nums.length - 1;
			while(start < end){
				if(nums[i] + nums[start] + nums[end] == target){
					return 0;
	            }
	            if(Math.abs(target - nums[i] - nums[start] - nums[end]) < Math.abs(target - result)){
					result = nums[i] + nums[start] + nums[end];
	            }
	            if(nums[i] + nums[start] + nums[end] > target) end--;
	            if(nums[i] + nums[start] + nums[end] < target) start++;
	        }
	    } 
	    return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
