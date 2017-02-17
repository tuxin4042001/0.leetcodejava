package _145_binaryTreePostOrderTraversal;

import java.util.ArrayList;
import java.util.List;

import _03_binaryTree.TreeNode;

public class postorderTraversal1 {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        helper(root, list);
        return list;
    }
    
    public void helper(TreeNode root, List<Integer> list){
    	if(root == null)
    		return;
    	helper(root.left, list);
    	helper(root.right, list);
    	list.add(root.val);
    }

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}

}
