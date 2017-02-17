package _92_reverseLinkedList2;

class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
 

public ListNode reverseBetween(ListNode head, int m, int n) {
        if(head == null) return null;
        ListNode start = new ListNode(0);
        start.next = head;
        ListNode pre = start;
        
        for(int i = 0; i < m -1; i++){
        	pre = pre.next;
        }
        
        ListNode begin = pre.next;
        ListNode then = begin.next;
        
        for(int i = 0; i < n - m; i++){
        	begin.next = then.next;
        	then.next = pre.next;
        	pre.next = then;
        	then = begin.next;
        }
        
        return start.next;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums = 7;
		if(true){
			int nums1 = 42;
		}

	}

}
