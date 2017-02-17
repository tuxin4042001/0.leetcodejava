package _1_Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class _Q6_Duplicate_M4 {

	public static boolean containsDuplicate(int[] nums) {
		HashMap map = new HashMap();
	    for(int i=0;i<nums.length;i++){
	    	if(map.containsValue(nums[i])){
	    		return true;		
	    	}
	    	map.put(map.size()+1,nums[i]);
	    }
		return false;
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[] nums = new int[] { 1, 2, 3, 4, 3, 26, 7 };
		System.out.println(containsDuplicate(nums));

	}

}
