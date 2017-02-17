package _90_subSetII;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subsetsWithDup {
    public static List<List<Integer>> subsetsWithDup(int[] nums) throws FileNotFoundException{
    	Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        List<Integer> tempList = new ArrayList<Integer>();
        backTrack(list, tempList, nums, 0);
        return list;
    }
    
    public static void backTrack(List<List<Integer>> list, List<Integer> tempList, int[] nums, int start) throws FileNotFoundException{
    	list.add(new ArrayList<Integer>(tempList));//将tempList实例化
    	
    	for(int i = start; i < nums.length; i++){
    		if(i > start && nums[i] == nums[i - 1]) continue;
    		tempList.add(nums[i]);
    		System.out.println("tempList add nums[i]: " + nums[i]);
    		System.out.print("tempList: ");
    		for(int l : tempList){
    			System.out.print(l + "=> ");
    		}
    		System.out.println();
    		backTrack(list, tempList, nums, i + 1);
    		tempList.remove(tempList.size() - 1);
    		System.out.println("tempList remove nums[i]: " + nums[i]);
    		System.out.print("tempList: ");
    		for(int l : tempList){
    			System.out.print(l + "=> ");
    		}
    		System.out.println();
    		
    	}
    }

	public static void main(String[] args) throws FileNotFoundException{
		// TODO 自动生成的方法存根
		System.setOut(new PrintStream(new FileOutputStream("D:\\output.txt")));
		int[] nums = {1,2,2};
		subsetsWithDup(nums);
		//BasicConfigurator.configure();
	}

}
