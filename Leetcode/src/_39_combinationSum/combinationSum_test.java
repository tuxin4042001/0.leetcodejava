package _39_combinationSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class combinationSum_test {
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
    	Arrays.sort(candidates);
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        List<Integer> tempList = new ArrayList<Integer>();
        backTrack(list, tempList, candidates, target, 0);
        return list;
    }
    
    public static void backTrack(List<List<Integer>> list, List<Integer> tempList, int[] candidates, int target, int start){
    	//the keypoint is to set a limit: when the target less than 0, return nothing;
    	//                                when the target equal to 0, means we find the subset, add this subset to list;
    	//another keypoint is that: in combination sum problem, what we want to do is find the qualified subset, its sum
    	//                          equals to target. Because it to find the subset, so we use loop for(int i = start; ;)
    	//                          because we can include duplicate element in candidates, if we want to move the elements
    	//                          in the loop, we consider if(target < 0) return; It will finish the loop and move it forward
    	if(target < 0) return;
    	if(target == 0){
    		list.add(new ArrayList(tempList));
    		System.out.println("//////////////////list add this tempList/////////////////////");
    	}
    	for(int i = start; i < candidates.length; i++){
    		tempList.add(candidates[i]);
    		
			System.out.println("tempList add nums[i]: " + candidates[i]);
			System.out.print("tempList: ");
			for (int l : tempList) {
				System.out.print(l + "=> ");
			}
			System.out.println();
			
    		backTrack(list, tempList, candidates, target - candidates[i], i);
    		tempList.remove(tempList.size() - 1);
    		
    		System.out.println("tempList remove nums[i]: " + candidates[i]);
    		System.out.print("tempList: ");
    		for(int l : tempList){
    			System.out.print(l + "=> ");
    		}
    		System.out.println();
    		
    	}
    }
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] candidates = {2,3,6,7};
		combinationSum(candidates, 7);

	}
}