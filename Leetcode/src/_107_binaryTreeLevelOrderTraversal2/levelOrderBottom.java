package _107_binaryTreeLevelOrderTraversal2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
import _03_binaryTree.TreeNode;

public class levelOrderBottom {
	//����һ������binary tree level order traversal, ����stack�������з��ص�List<Integer>, Ȼ��Ӻ���ǰ
	//     �洢��List<List<Integer>> list����
	public List<List<Integer>> levelOrderBottom(TreeNode root) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		Stack<List<Integer>> stack = new Stack<List<Integer>>();
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		helper1(root, stack, queue);
		helper2(stack, list);
		return list;
	}

	public void helper1(TreeNode root, Stack<List<Integer>> stack, Queue<TreeNode> queue) {
		if (root == null)
			return;
		queue.offer(root);
		int size = 1;
		while (!queue.isEmpty()) {
			List<Integer> tempList = new ArrayList<Integer>();
			for (int i = 0; i < size; i++) {
				TreeNode currNode = queue.poll();
				if (currNode.left != null) queue.offer(currNode.left);
                if (currNode.right != null) queue.offer(currNode.right);
                tempList.add(currNode.val);
			}
			stack.push(tempList);
			size = queue.size();
		}
	}
	
	public void helper2(Stack<List<Integer>> stack, List<List<Integer>> list){
		while(!stack.isEmpty()){
			list.add(stack.pop());
		}
	}

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������

	}

}
