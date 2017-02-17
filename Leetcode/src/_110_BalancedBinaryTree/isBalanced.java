package _110_BalancedBinaryTree;

import _03_binaryTree.TreeNode;

public class isBalanced {
	//����������ж϶������Ƿ�ƽ��ֻ��ͨ���߶����жϣ����������ǲ��еģ�������������£�
	//                     1
	//                  2    2
	//                3   3
	//              4   4
	//���жϲ�����, root.left != null && root.right != null, root.left is balanced && root.right is balanced, �������ƽ�������
    public boolean isBalanced(TreeNode root) {
        if(root == null)
        	return true;
        if(root.left == null && root.right == null) 
        	return true;
        if(root.left == null && root.right != null){
        	if(root.right.left != null || root.right.right != null){
        		return false;
        	}else{
        		return true;
        	}
        }
        if(root.right == null && root.left !=null){
        	if(root.left.left != null || root.left.right != null){
        		return false;
        	}else{
        		return true;
        	}
        }
        return isBalanced(root.left) && isBalanced(root.right);
    }

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������

	}

}
