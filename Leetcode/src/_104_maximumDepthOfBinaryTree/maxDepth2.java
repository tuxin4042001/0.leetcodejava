package _104_maximumDepthOfBinaryTree;

import java.util.LinkedList;
import java.util.Stack;

public class maxDepth2 {
    public int maxDepth(TreeNode root) {
        if(root == null)
        	return 0;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        int size = 1;
        int depth = 0;
        while(!stack.isEmpty()){
        	for(int i = 0; i < size; i++){
        		TreeNode currNode = stack.pop();
        		if(currNode.left != null) stack.push(currNode.left);
        		if(currNode.right != null) stack.push(currNode.right);
        	}
        	size = stack.size();
        	depth++;
        }
        return depth-1;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
