package _106_constructBinaryTreeFromInorderAndPostorderTraversal;

import _01_binaryTree.TreeNode;

public class buildTree {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return helper(0, postorder.length - 1, 0, inorder.length - 1, inorder, postorder);
    }
    
    public TreeNode helper(int poststart, int postend, int instart, int inend, int[] inorder, int[] postorder){
    	if(poststart > postend || instart > inend){
    		return null;
    	}
    	
    	TreeNode root = new TreeNode(postorder[postend]);
    	int inIndex = 0;
    	for(int i = 0; i < inorder.length; i++){
    		if(inorder[i] == postorder[postend]){
    			inIndex = i;
    			break;
    		}
    	}
    	root.left = helper(poststart, poststart + inIndex - instart - 1, instart, inIndex - 1, inorder, postorder);
    	root.right = helper(poststart + inIndex - instart, postend - 1, inIndex + 1, inend, inorder, postorder);
    	return root;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
