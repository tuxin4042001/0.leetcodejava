package _1_Arrays;

import java.util.Arrays;

public class _Q6_Duplicate_M2 {
	public static boolean containsDuplicate(int[] nums) {
      Arrays.sort(nums);
      boolean result = false;
      for(int i=0;i<nums.length;i++){
    	  if(nums[i]==nums[i+1]){
    		  result=true;
    		  break;
    	  }
      }
      return result;
	}
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[] nums = new int[] { 1, 2, 3, 4, 3, 26, 7 };
		System.out.println(containsDuplicate(nums));

	}
}
