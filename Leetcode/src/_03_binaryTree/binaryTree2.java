package _03_binaryTree;

public class binaryTree2 {
	TreeNode root;
	
	public void addNode(int val){
		TreeNode newNode = new TreeNode(val);
		
		if(root == null){
			root = newNode;
		}else{
			TreeNode focusNode = root;
			TreeNode parent;
			while(true){
				parent = focusNode;
				if(val < focusNode.val){
					focusNode = focusNode.left;
					if(focusNode == null){
						parent.left = newNode;
						return;
					}
				}else{
					focusNode = focusNode.right;
					if(focusNode == null){
						parent.right = newNode;
						return;
					}
				}
			}
		}
	}

	public void inorderTraversal(TreeNode focusNode){
		if(focusNode == null)
			return;
		inorderTraversal(focusNode.left);
		System.out.println(focusNode.val + " --> ");
		inorderTraversal(focusNode.right);
	}
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		binaryTree2 tree = new binaryTree2();
		tree.addNode(1);
		tree.addNode(2);
		tree.addNode(3);

		tree.inorderTraversal(tree.root);
	}

}
