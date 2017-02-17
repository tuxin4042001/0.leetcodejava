package _110_BalancedBinaryTree;

import _03_binaryTree.TreeNode;
import _03_binaryTree.maxDepth;

public class isBalanced2 {
    public boolean isBalanced(TreeNode root) {
        if(root == null)
        	return true;
        if(Math.abs(maxDepth(root.left) - maxDepth(root.right)) > 1)
        	return false;
        return isBalanced(root.left) && isBalanced(root.right);
    }
    
    public int maxDepth(TreeNode root){
    	if(root == null)
    		return 0;
    	return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}

}
