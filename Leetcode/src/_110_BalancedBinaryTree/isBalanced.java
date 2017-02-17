package _110_BalancedBinaryTree;

import _03_binaryTree.TreeNode;

public class isBalanced {
	//问题分析，判断二叉树是否平衡只能通过高度来判断，这样描述是不行的，如果二叉树如下：
	//                     1
	//                  2    2
	//                3   3
	//              4   4
	//就判断不出来, root.left != null && root.right != null, root.left is balanced && root.right is balanced, 结果就是平衡二叉树
    public boolean isBalanced(TreeNode root) {
        if(root == null)
        	return true;
        if(root.left == null && root.right == null) 
        	return true;
        if(root.left == null && root.right != null){
        	if(root.right.left != null || root.right.right != null){
        		return false;
        	}else{
        		return true;
        	}
        }
        if(root.right == null && root.left !=null){
        	if(root.left.left != null || root.left.right != null){
        		return false;
        	}else{
        		return true;
        	}
        }
        return isBalanced(root.left) && isBalanced(root.right);
    }

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}

}
