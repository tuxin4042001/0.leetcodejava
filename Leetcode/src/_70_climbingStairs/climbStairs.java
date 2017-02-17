package _70_climbingStairs;

import _02_public_LinkList.ListNode;

class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }

public class climbStairs {
	//方法一：采用迭代的方法，首先设置初始条件if(n==0) if(n==1) if(n==2),然后迭代 ClimbStairs(n) = ClimbStairs(n-1)+ClimbStairs(n-2);
    public static int ClimbStairs(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;
        if(n == 2) return 2;
        return ClimbStairs(n-1)+ClimbStairs(n-2);
    }
    
    //方法二：分析问题，得出C(n) = C(n-1) + C(n-2)的解困，直接顺推求和求解
    public int ClimbStairs2(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;
        if(n == 2) return 2;
        int first = 1;
        int second = 2;
        int result = 0;
        for(int i = 3; i <= n; i++){
        	result = first + second;
        	first = second;
        	second = result;
        }
        return result;
    }
    
    public static ListNode deleteDuplicates2(ListNode head) {
        if(head == null || head.next == null)return head;
        head.next = deleteDuplicates(head.next);
        return head.val == head.next.val ? head.next : head;
}
    
    public static ListNode deleteDuplicates(ListNode head){
    	ListNode start = new ListNode(0);
    	start.next = head;
    	if(head == null || head.next == null){
    		return head;
        }
    	while(head.next != null){
    		if(head.val == head.next.val){
    			head.next = head.next.next;
            }else{
            	head = head.next;
            }
    }
         return start.next;
    }
    
    public boolean isSymmetric(TreeNode root){
    	if(root == null){
    		return true;
        }
        if(isMirror(root.left, root.right)){
        	return true;
        }
        return false;
    }

    public boolean isMirror(TreeNode left, TreeNode right){
    	if(left == null && right == null){
    		return true;
        }
        if(left == null || right == null){
        	return false;
        }
        if(left.val == right.val){
        	return isMirror(left.left, right.right) && isMirror(left.right, right.left);
        }else{
        	return false;
        }
    }

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(1);
        n1.next = n2;
        ListNode n3 = deleteDuplicates(n1);
        ListNode current = n3;
        while(current != null){
        	System.out.println(current.val);
        	current = current.next;
        }
	}
}
