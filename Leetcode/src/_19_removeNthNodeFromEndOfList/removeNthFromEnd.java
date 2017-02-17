package _19_removeNthNodeFromEndOfList;

  class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
 

public class removeNthFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
    	ListNode start = new ListNode(0);
    	start.next = head;
        ListNode slow = start;
        ListNode fast = start;
        for(int i = 0; i <= n; i++){
        	fast = fast.next;
        }
        
        while(fast != null){
        	slow = slow.next;
        	fast = fast.next;
        }
        
        slow.next = slow.next.next;
        return start.next;
    }
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
