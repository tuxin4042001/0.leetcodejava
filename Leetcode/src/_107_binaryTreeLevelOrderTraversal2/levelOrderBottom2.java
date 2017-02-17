package _107_binaryTreeLevelOrderTraversal2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.print.attribute.Size2DSyntax;

import _03_binaryTree.TreeNode;

public class levelOrderBottom2 {
	//方法二：关键在于放入list的时候不是从后往前放，而是从前往后放，list.add(0, tempList), 这样就不需要stack做中转了；
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        helper(root, list, queue);
        return list;
    }
    
    public void helper(TreeNode root, List<List<Integer>> list, Queue<TreeNode> queue){
    	if(root == null)
    		return;
    	queue.offer(root);
    	int size = 1;
    	while(!queue.isEmpty()){
    		List<Integer> tempList = new ArrayList<Integer>();
    		for(int i = 0; i < size; i++){
    			TreeNode currNode = queue.poll();
    			if(currNode.left != null) queue.offer(currNode.left);
    			if(currNode.right != null) queue.offer(currNode.right);
    			tempList.add(currNode.val);
    		}
    		list.add(0, tempList);
    		size = queue.size();
    	}
    }

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}

}
