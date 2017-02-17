package _03_binaryTree;

 public class TreeNode {
     public int val;
     public TreeNode left;
     public TreeNode right;
     public TreeNode(int x) {
    	 this.val = x;
     }
     public String toString(){
    	 return "currentNode has a val " + val;
     }
 }
