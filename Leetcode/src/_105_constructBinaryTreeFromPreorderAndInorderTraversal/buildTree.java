package _105_constructBinaryTreeFromPreorderAndInorderTraversal;

import _03_binaryTree.TreeNode;

public class buildTree {
	//�ⷨ��ע�����Ǵ�preorder��inorder�ֱ���Ի��ʲô��Ϣ��
	//                  1
	//              2        3
    //           4     5  6      7
	//    preorder = [1,2,4,5,3,6,7] inorder = [4,2,5,1,6,3,7]
	//    preorder���Եõ���, preorder��һλ��"1"���Ǹ�, �ҵ��˸��Ϳ�����inorder�����ֳ���������, [4,2,5] [1] [6,3,7], �洢��TreeNode root = new TreeNode(preorder[prestart])
	//    ����inorder�����ֵ�������������, ������preorder���ҳ���Ӧ����������[1] [2,4,5] [3,6,7]
	//    [2,4,5] [4,2,5], [3,6,7] [6,3,7]���Թ����µ�preorder inorder, �����ҳ�root.left root.right
	//    root.left = .... ; root.right = ....;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return helper(0, preorder.length - 1, 0, inorder.length - 1, preorder, inorder);
    }
    
    public TreeNode helper(int prestart, int preend, int instart, int inend, int[] preorder, int[] inorder){
    	//�ؼ���1:ʲôʱ�򷵻�?
    	if(prestart > preend || instart > inend){
    		return null;
    	}
    	//�ؼ���2:�洢root
    	TreeNode root = new TreeNode(preorder[prestart]);
    	int inIndex = 0;
    	for(int i = 0; i < inorder.length; i++){
    		if(inorder[i] == preorder[prestart]){
    			inIndex = i;
    		}
    	}
    	//�ؼ���3:�ҵ�root.left root.right
    	root.left = helper(prestart + 1, prestart + inIndex - instart, instart, inIndex - 1, preorder, inorder);
    	root.right = helper(prestart + inIndex - instart + 1, preend, inIndex + 1, inend, preorder, inorder);
    	return root;
    }

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������

	}

}
