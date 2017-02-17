package _105_constructBinaryTreeFromPreorderAndInorderTraversal;

import _01_binaryTree.TreeNode;

public class buildTree {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return helper(0, preorder.length - 1, 0, inorder.length - 1, preorder, inorder);
    }
    
    public TreeNode helper(int prestart, int preend, int instart, int inend, int[] preorder, int[] inorder){
    	if(prestart > preend || instart > inend)
    		return null;
    	TreeNode root = new TreeNode(preorder[prestart]);
    	int inIndex = 0;
    	for(int i = 0; i < inorder.length; i++){
    		if(inorder[i] == preorder[prestart]){
    			inIndex = i;
    			break;
    		}
    	}
    	root.left = helper(prestart + 1, prestart + inIndex - instart, instart, inIndex - 1, preorder, inorder);
    	root.right = helper(prestart + inIndex - instart + 1, preend, inIndex + 1, inend, preorder, inorder);
    	return root;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
