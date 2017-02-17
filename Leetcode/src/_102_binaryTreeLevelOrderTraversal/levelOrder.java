package _102_binaryTreeLevelOrderTraversal;

import java.util.LinkedList;
import java.util.Queue;

import _03_binaryTree.TreeNode;

public class levelOrder {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
        TreeNode tr1 = new TreeNode(10);
        TreeNode tr2 = new TreeNode(7);
        TreeNode tr3 = new TreeNode(12);
        tr1.left = tr2;
        tr2.right = tr3;
        
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        
        queue.offer(tr1);
        
        int num = queue.size();
        System.out.println(num);
        
	}

}
