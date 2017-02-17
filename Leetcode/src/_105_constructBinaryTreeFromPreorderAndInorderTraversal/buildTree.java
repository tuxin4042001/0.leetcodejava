package _105_constructBinaryTreeFromPreorderAndInorderTraversal;

import _03_binaryTree.TreeNode;

public class buildTree {
	//解法：注意我们从preorder和inorder分别可以获得什么信息？
	//                  1
	//              2        3
    //           4     5  6      7
	//    preorder = [1,2,4,5,3,6,7] inorder = [4,2,5,1,6,3,7]
	//    preorder可以得到根, preorder第一位是"1"就是根, 找到了根就可以在inorder中区分出左右子树, [4,2,5] [1] [6,3,7], 存储根TreeNode root = new TreeNode(preorder[prestart])
	//    根据inorder中区分的左右子树长度, 可以在preorder中找出响应的左右子树[1] [2,4,5] [3,6,7]
	//    [2,4,5] [4,2,5], [3,6,7] [6,3,7]可以构成新的preorder inorder, 重新找出root.left root.right
	//    root.left = .... ; root.right = ....;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return helper(0, preorder.length - 1, 0, inorder.length - 1, preorder, inorder);
    }
    
    public TreeNode helper(int prestart, int preend, int instart, int inend, int[] preorder, int[] inorder){
    	//关键点1:什么时候返回?
    	if(prestart > preend || instart > inend){
    		return null;
    	}
    	//关键点2:存储root
    	TreeNode root = new TreeNode(preorder[prestart]);
    	int inIndex = 0;
    	for(int i = 0; i < inorder.length; i++){
    		if(inorder[i] == preorder[prestart]){
    			inIndex = i;
    		}
    	}
    	//关键点3:找到root.left root.right
    	root.left = helper(prestart + 1, prestart + inIndex - instart, instart, inIndex - 1, preorder, inorder);
    	root.right = helper(prestart + inIndex - instart + 1, preend, inIndex + 1, inend, preorder, inorder);
    	return root;
    }

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}

}
