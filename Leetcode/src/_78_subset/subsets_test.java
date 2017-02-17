package _78_subset;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subsets_test {
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> tempList = new ArrayList<Integer>();
        getResult(result, tempList, nums, 0);
        return result;
    }
    
    public static void getResult(List<List<Integer>> result, List<Integer> tempList, int[] nums, int start){
    	result.add(new ArrayList<Integer>(tempList));
    	
    	for(int i = start; i < nums.length; i++){
    		tempList.add(nums[i]);
    		//////////test/////////////
			System.out.println("tempList add nums[i]: " + nums[i]);
			System.out.print("tempList: ");
			for (int l : tempList) {
				System.out.print(l + "=> ");
			}
			System.out.println();
			
    		getResult(result, tempList, nums, i+1);
    		tempList.remove(tempList.size() - 1);
            //////////test/////////////
    		System.out.println("tempList remove nums[i]: " + nums[i]);
    		System.out.print("tempList: ");
    		for(int l : tempList){
    			System.out.print(l + "=> ");
    		}
    		System.out.println();
    	}
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1, 2, 2};
		subsets(nums);

	}

}
