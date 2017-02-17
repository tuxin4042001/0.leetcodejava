package _03_binaryTree;

public class maxDepth {
	static int root_depth = 0;

	public static int maxDepth(TreeNode root) {
		if (root == null) {
			return root_depth;
		} else {
			return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
		}

	}

}
