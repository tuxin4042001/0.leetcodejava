package _46_permutation;

import java.util.ArrayList;
import java.util.List;

public class permute1_test {
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        List<Integer> tempList = new ArrayList<Integer>();
        backTrack(list, tempList, nums);
        return list;
    }
    
    public static void backTrack(List<List<Integer>> list, List<Integer> tempList, int[] nums){
    	if(tempList.size() == nums.length){
    		//问题1：这里我们需要使用new ArrayList(tempList)将List<Integer> tempList实例化，否则tempList一直为空
    		list.add(new ArrayList<Integer>(tempList));
    	}
    	for(int i = 0; i < nums.length; i++){
    		//问题2：跟之前说的一样，subset处理的是非固定长度组合的问题，permutation处理的是固定长度排列的问题，所以如下
    		//① subsets添加没有限制条件list.add(new ArrayList(tempList)), permutation添加有限制条件if(tempList.size() == nums.length)
    		//② subset的循环从start开始, for(int i = start; ;) + backTrack(list, tempList, nums, i+1), 利用start和i+1实现移动
    		//  permutation的循环从0开始, for(int i = 0; ;) + if(tempList.contains(nums[i])) 或者
    		//                          for(int i = 0; ;) + if(used[i])实现移动
    		if(tempList.contains(nums[i])){
    			continue;     
    		}else{
    			tempList.add(nums[i]);
    			
    			System.out.println("tempList add nums[i]: " + nums[i]);
    			System.out.print("tempList: ");
    			for (int l : tempList) {
    				System.out.print(l + "=> ");
    			}
    			System.out.println();
    			
    			backTrack(list, tempList, nums);
    			tempList.remove(tempList.size() - 1);
    			
        		System.out.println("tempList remove nums[i]: " + nums[i]);
        		System.out.print("tempList: ");
        		for(int l : tempList){
        			System.out.print(l + "=> ");
        		}
        		System.out.println();
    		}
    	}
    }
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1, 2, 3};
		permute(nums);

	}

}
