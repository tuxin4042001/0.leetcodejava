package _94_binaryTreeInOrderTraversal;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import _03_binaryTree.TreeNode;

//方法二：利用迭代和stack模仿递归的过程
public class inorderTraversal2 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        while(root != null || !stack.isEmpty()){
        	if(root != null){
        		stack.push(root);
        		root = root.left;
        	}else{
        		root = stack.pop();
        		list.add(root.val);
        		root = root.right;
        	}
        }
        return list;
    }

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}

}
