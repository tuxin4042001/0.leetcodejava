package _102_binaryTreeLevelOrderTraversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}

//解法：利用数据结构queue进行求解，利用queue来实现一行一行添加，扫描，删除, while(!queue.isEmpty())实现整个binary tree的扫描
//    利用for(int i = 0; i < queue.size(); i++)实现binary tree每行扫描
public class levelOrder {
    public List<List<Integer>> levelOrder(TreeNode root) {
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
    		List<Integer> subList = new ArrayList<Integer>();
    		for(int i = 0; i < size; i++){
    			if(queue.peek().left != null) queue.offer(queue.peek().left);
    			if(queue.peek().right != null) queue.offer(queue.peek().right);
    			subList.add(queue.poll().val);
    		}
    		list.add(subList);
    		size = queue.size();    	
    	}
    	
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
