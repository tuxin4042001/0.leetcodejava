package _1_twoSum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Iterator;

public class twoSum {
	public int[] twoSum1(int[] nums, int target) {
		int[] result = new int[2];
		for(int i = 0; i < nums.length; i++){
			for(int j = i + 1; j < nums.length; j++){
				if(nums[i] + nums[j] == target){
					result[0] = i;
					result[1] = j;
					return result;
				}
			}
		}
		return result;
	}

	public static int[] twoSum2(int[] nums, int target) {
		int[] result = new int[2];
		Map<Integer, Integer> ma = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (ma.containsKey(target - nums[i])) {
				result[1] = ma.get(target - nums[i]);
				result[0] = i;
				return result;
			}
			ma.put(nums[i], i);
		}
		return result;
	}
}