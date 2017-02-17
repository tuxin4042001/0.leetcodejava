package _104_maximumDepthOfBinaryTree;


class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}

public class maxDepth {
	public int maxDepth(TreeNode root) {
	    if(root == null)
	    	return 0;
	    return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
