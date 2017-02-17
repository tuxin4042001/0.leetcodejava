package _03_binaryTree;

public class minDepth {
	static int root_depth = 0;

	public static int minDepth(TreeNode root) {
		if (root == null) {
			return root_depth;
		} else {
			return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
		}

	}

}
