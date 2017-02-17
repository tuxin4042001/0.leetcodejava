package _94_binaryTreeInOrderTraversal;

import java.util.ArrayList;
import java.util.List;

import _03_binaryTree.TreeNode;

//����1���ݹ�ķ���
public class inorderTraversal1 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        helper(root, list);
        return list;
    }
    
    public void helper(TreeNode root, List<Integer> list){
    	if(root == null)
    		return;
    	helper(root.left, list);
    	list.add(root.val);
    	helper(root.right, list);
    }

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������

	}

}
