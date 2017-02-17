package _103_binaryTreeZigZagLevelOrderTraversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//解法：顺时针添加元素到queue，zigzag前后向扫描添加元素到tempList
//    a.顺时针添加元素到queue, 从左到右:
//      if(currNode.left != null) queue.add(currNode.left);
//      if(currNode.right != null) queue.add(currNode.right);
//    b.zigzag前后向扫描添加元素到tempList
//      if(isForward){
//	    tempList.add(currNode.val);
//      }else{
//	    tempList.add(0, currNode.val);
//      }
//    c.注意queue数据结构, 后进先出, .add .offer在后面, .peek .poll .remove在前面
//    d.注意ArrayList, .add(currNode.val)是从后添加元素, add(0, currNode.val)是从前往后添加元素

public class zigzagLevelOrder2 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        helper(root, list, queue);
        return list;
    }
    
    public void helper(TreeNode root, List<List<Integer>> list, Queue<TreeNode> queue){
    	if(root == null)
    		return;
    	queue.add(root);
    	boolean isForward = true;
    	int size = 1;
    	while(!queue.isEmpty()){
    		List<Integer> tempList = new ArrayList<Integer>();
    		for(int i = 0; i < size; i++){
        		TreeNode currNode = queue.poll();
    			if(isForward){
    				tempList.add(currNode.val);
    			}else{
    				tempList.add(0, currNode.val);
    			}
    			if(currNode.left != null) queue.add(currNode.left);
    			if(currNode.right != null) queue.add(currNode.right);
    		}
    		list.add(tempList);
    		size = queue.size();
    		isForward = !isForward;
    	}
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
