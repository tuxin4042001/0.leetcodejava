package _34_searchForARange;

import java.util.Arrays;

public class searchRange2 {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        result[0] = Arrays.binarySearch(nums, target);
        int[] numsNew = Arrays.copyOfRange(nums, result[0] + 1, nums.length - 1);
        result[1] = Arrays.binarySearch(numsNew, target);
        return result;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int i = 2;
//		int j = i >> 1;
//		System.out.println(j);
		int i = 9;
		int j = 10;
		int k = (i+j)/2;
		System.out.println(k);

	}

}
