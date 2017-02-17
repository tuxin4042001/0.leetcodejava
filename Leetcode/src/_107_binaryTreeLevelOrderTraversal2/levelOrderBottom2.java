package _107_binaryTreeLevelOrderTraversal2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.print.attribute.Size2DSyntax;

import _03_binaryTree.TreeNode;

public class levelOrderBottom2 {
	//���������ؼ����ڷ���list��ʱ���ǴӺ���ǰ�ţ����Ǵ�ǰ����ţ�list.add(0, tempList), �����Ͳ���Ҫstack����ת�ˣ�
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
		// TODO �Զ����ɵķ������

	}

}
