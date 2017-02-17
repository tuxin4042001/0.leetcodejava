package _111_minimumDepthOfBinaryTree;

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}

public class minDepth {
    public int minDepth(TreeNode root) {
        if(root == null)
        	return 0;
        int left = minDepth(root.left);
        int right = minDepth(root.right);
        return (root.left == null || root.right == null)? left+right+1 : Math.min(left, right) + 1;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
