package _103_binaryTreeZigZagLevelOrderTraversal;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}

public class zigzagLevelOrder {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        helper(root, list, stack);
        return list;
    }
    
    public void helper(TreeNode root, List<List<Integer>> list, Stack<TreeNode> stack){
    	if(root == null)
    		return;
    	stack.push(root);
    	boolean isForward = true;
    	while(!stack.isEmpty()){
    		List<Integer> subList = new ArrayList<Integer>();
    		if(isForward){
    			for(int i = 0; i < stack.size(); i++){
    				if(stack.peek().right != null) stack.push(stack.peek().right);
    				if(stack.peek().left != null) stack.push(stack.peek().left);
    				subList.add(stack.pop().val);
    			}
    		}else{
    			for(int i = 0; i < stack.size(); i++){
    				if(stack.peek().left != null) stack.push(stack.peek().left);
    				if(stack.peek().right != null) stack.push(stack.peek().right);
    				subList.add(stack.pop().val);
    			}
    		}
    		list.add(subList);
    		isForward = !isForward;
    	}
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
