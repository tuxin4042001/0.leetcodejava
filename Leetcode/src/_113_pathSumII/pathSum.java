package _113_pathSumII;

import java.util.ArrayList;
import java.util.List;

import _01_binaryTree.TreeNode;

public class pathSum {
	//解法：使用backTrack方法求解，backTrack的方法类似触手，沿不同的path向下触及，如果list.add(tempList)同时使用tempList.remove(tempList.size() - 1)收回来；
	//    如果不成功也直接使用tempList.remove(tempList.size() - 1)收回来；
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        List<Integer> tempList = new ArrayList<Integer>();
        backTrack(root, sum, list, tempList);
        return list;
    } 
    
    public void backTrack(TreeNode root, int sum, List<List<Integer>> list, List<Integer> tempList){
    	if(root == null)
    		return;
    	tempList.add(root.val);
    	if(root.left == null && root.right == null && root.val == sum){
    		list.add(new ArrayList<Integer>(tempList));
    		tempList.remove(tempList.size() - 1);
    		return;
    	}else{
    		backTrack(root.left, sum - root.val, list, tempList);
    		backTrack(root.right, sum - root.val, list, tempList);
    	}
    	tempList.remove(tempList.size() - 1);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
