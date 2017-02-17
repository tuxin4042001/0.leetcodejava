package _129_sumRootToLeafNumbers;

import _01_binaryTree.TreeNode;

public class sumNumbers {
    public int sumNumbers(TreeNode root) {
    	return sum(root, 0);
    }
    
    public int sum(TreeNode root, int sum){
    	if(root == null)
    		return 0;
    	if(root.left == null && root.right == null)
    		return sum*10 + root.val;
    	return sum(root.left, sum*10 + root.val) + sum(root.right, sum*10 + root.val);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
