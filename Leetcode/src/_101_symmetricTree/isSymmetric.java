package _101_symmetricTree;


class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}

public class isSymmetric {
    public boolean isSymmetric(TreeNode root) {
        if(root == null)
        	return true;
        return isSymmetricHelper(root.left, root.right);
    }
    
    public boolean isSymmetricHelper(TreeNode p, TreeNode q){
    	if(p == null && q == null)
    		return true;
    	if(p == null || q == null)
    		return false;
    	if(p.val == q.val){
    		return isSymmetricHelper(p.right, q.left) && isSymmetricHelper(p.left, q.right);
    	}
    	return false;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
