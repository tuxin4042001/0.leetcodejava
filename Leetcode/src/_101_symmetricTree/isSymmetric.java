package _101_SymmetricTree;

import _03_binaryTree.TreeNode;

public class isSymmetric {
    public boolean isSymmetric(TreeNode root){
    	if(root == null){
    		return true;
        }
        if(isMirror(root.left, root.right)){
        	return true;
        }
        return false;
    }

    public boolean isMirror(TreeNode left, TreeNode right){
    	if(left == null && right == null){
    		return true;
        }
        if(left == null || right == null){
        	return false;
        }
        if(left.val == right.val){
        	return isMirror(left.left, right.right) && isMirror(left.right, right.left);
        }else{
        	return false;
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
