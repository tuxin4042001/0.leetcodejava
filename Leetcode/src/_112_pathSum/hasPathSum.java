package _112_pathSum;

import _01_binaryTree.TreeNode;

public class hasPathSum {
	//方法一：采用迭代的方法，关键注意root == null的时候，return false
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null)
        	return false;
        if(root.left == null && root.right == null && root.val == sum)
        	return true;
        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
