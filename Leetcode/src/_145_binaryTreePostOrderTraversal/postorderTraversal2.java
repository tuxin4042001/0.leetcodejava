package _145_binaryTreePostOrderTraversal;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import _03_binaryTree.TreeNode;
import _48_rotateImage.rotate;

public class postorderTraversal2 {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        while(root != null || stack.size() != 0){
        	if(root != null){
        		stack.push(root);
        		root = root.left;
        	}else{
        		root = stack.pop();
        		root = root.right;
        		list.add(root.val);
        	}
        }
        return list;
    }

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}

}
