package _78_Subsets;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class subsets {
    public static List<List<Integer>> subsets(int[] nums) throws FileNotFoundException{
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        List<Integer> tempList = new ArrayList<Integer>();
        backTrack(list, tempList, nums, 0);
        return list;
    }
    
    public static void backTrack(List<List<Integer>> list, List<Integer> tempList, int[] nums, int start) throws FileNotFoundException{
    	list.add(new ArrayList<Integer>(tempList));//将tempList实例化
    	
    	for(int i = start; i < nums.length; i++){
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
		int[] nums = {1,2,3};
		subsets(nums);
		//BasicConfigurator.configure();
	}

}
