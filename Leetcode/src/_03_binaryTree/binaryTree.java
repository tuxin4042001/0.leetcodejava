package _03_binaryTree;

public class binaryTree {
	Node root;

	public void addNode(int key, String name) {
		Node newnode = new Node(key, name);
		if (root == null) {
			root = newnode;

		} else {
			Node focusnode = root;
			Node parent;
			while (true) {
				parent = focusnode;
				if (key < focusnode.key) {
					focusnode = focusnode.leftchild;
					if (focusnode == null) {
						parent.leftchild = newnode;
						return;
					}
				} else {
					focusnode = focusnode.rightchild;
					if (focusnode == null) {
						parent.rightchild = newnode;
						return;
					}
				}
			}
		}
	}

	// 利用函数自身的迭代实现二叉树的遍历;
	public void inOrderTraverseTree(Node focusnode) {
		if (focusnode != null) {
			inOrderTraverseTree(focusnode.leftchild);
			System.out.println(focusnode);
			inOrderTraverseTree(focusnode.rightchild);
		}
	}

	public void preOrderTraverseTree(Node focusnode) {
		if (focusnode != null) {
			System.out.println(focusnode);
			preOrderTraverseTree(focusnode.leftchild);
			preOrderTraverseTree(focusnode.rightchild);
		}
	}

	public void postOrderTraverseTree(Node focusnode) {
		if (focusnode != null) {
			postOrderTraverseTree(focusnode.leftchild);
			postOrderTraverseTree(focusnode.rightchild);
			System.out.println(focusnode);
		}
	}

	public Node findNode(int key) {
		Node focusnode = root;
		while (focusnode.key != key) {
			if (key < focusnode.key) {
				focusnode = focusnode.leftchild;
			} else {
				focusnode = focusnode.rightchild;
			}
			if (focusnode == null) {
				return null;
			}
		}
		return focusnode;
	}

	public Node setNode(int key, String name) {
		Node focusnode = root;
		while (focusnode.key != key) {
			if (key < focusnode.key) {
				focusnode = focusnode.leftchild;
			} else {
				focusnode = focusnode.rightchild;
			}
			if (focusnode == null) {
				return null;
			}
		}
		focusnode.key = key;
		focusnode.name = name;
		return focusnode;
	}

	public int maxDepth(Node root) {
		if (root == null) {
			return 0;
		} else {
			int i = maxDepth(root.leftchild);
			int j = maxDepth(root.rightchild);
			return 1 + Math.max(i, j);
		}
	}

	public Node invertBinaryTree(Node root) {
		if (root == null) {
			return root;
		}
		Node focusnode = root;
		Node temp;
		temp = focusnode.leftchild;
		focusnode.leftchild = focusnode.rightchild;
		focusnode.rightchild = temp;
		invertBinaryTree(focusnode.leftchild);
		invertBinaryTree(focusnode.rightchild);
		return focusnode;
	}

	public boolean isSameTree(Node p, Node q) {
		if (p == null && q == null) {
			return true;
		}

		if (p == null || q == null) {
			return false;
		}

		if (p.key == q.key) {
			boolean left = isSameTree(p.leftchild, q.leftchild);
			boolean right = isSameTree(p.rightchild, q.rightchild);
			return (left & right);
		}

		return false;
	}

	public static void main(String args[]) throws Exception {
		binaryTree tree = new binaryTree();
		tree.addNode(1, "root");
		tree.addNode(15, "Xin Tu");
		tree.addNode(18, "Yang Yue");
		tree.addNode(2, "Fang Zhang");
		tree.addNode(7, "Chuanjie Yue");
		tree.addNode(8, "Aiqun Tang");
		tree.addNode(19, "Runguang Tu");
		tree.inOrderTraverseTree(tree.root);
		System.out.println();
		System.out.println();

		// Node root2 = tree.invertBinaryTree(root);

		binaryTree tree2 = new binaryTree();
		tree2.addNode(2, "root2");
		tree2.addNode(13, "Xin Tu");
		tree2.addNode(14, "Yang Yue");
		tree2.addNode(5, "Fang Zhang");
		tree2.inOrderTraverseTree(tree2.root);

		boolean result = tree.isSameTree(tree.root, tree2.root);
		System.out.println(result);
		// tree.preOrderTraverseTree(root);
		// tree.postOrderTraverseTree(root);
		// System.out.println("search for 30: ");
		// System.out.println(tree.findNode(18));
		// System.out.println(tree.maxDepth(root));
	}
}
