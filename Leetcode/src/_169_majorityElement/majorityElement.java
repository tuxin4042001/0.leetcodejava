package _169_majorityElement;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class majorityElement {
	public int majorityElement(int[] nums) {
		Arrays.sort(nums);
		return nums[nums.length / 2];
	}

	public static int majorityElement2(int[] nums) {
		List<Integer> array = new ArrayList<Integer>();
		for (int i = 0; i < nums.length; i++) {
			if(array.isEmpty()){
				array.add(nums[i]);
			}else{
				if(nums[i] == array.get(array.size()-1)){
					array.add(nums[i]);
				}else{
					array.remove(array.size()-1);
				}
			}
		}
		return array.get(0);
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[] nums = new int[9];
		for (int i = 0; i < 9; i++) {
			System.out.println(nums[i]);
		}

		List<Integer> array = new ArrayList<Integer>();
		int[] num = {1};
		array.add(1);
		array.add(2);
		System.out.println(array.get(0));
		System.out.println(array.get(1));
		array.remove(0);
		System.out.println(array.get(0));
		
	}

}
