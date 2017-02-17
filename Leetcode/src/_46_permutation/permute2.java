package _46_permutation;

import java.util.ArrayList;
import java.util.List;

public class permute2 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        List<Integer> tempList = new ArrayList<Integer>();
        boolean[] used = new boolean[nums.length];
        backtrack(list, tempList, nums, used);
        return list;
    }
    
    public void backtrack(List<List<Integer>>list, List<Integer> tempList, int[] nums, boolean[] used){
    	if(tempList.size() == nums.length){
    		list.add(new ArrayList(tempList));
    	}
    	for(int i = 0; i < nums.length; i++){
    		//方法2,如何忽略掉已经使用过的值,使用boolean[] used数组记录
    		//当used[i]已经使用过,在backTrack过程中就忽略掉,如果nums[i]被移除,used[i]置为false
    		if(used[i]){
    			continue;
    		}else{
    			tempList.add(nums[i]);
    			used[i] = true;
    			backtrack(list, tempList, nums, used);
    			tempList.remove(tempList.size() - 1);
    			used[i] = false;
    		}
    	}
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
