package _19_removeNthFromEnd;

import _02_public_LinkList.ListNode;

//use two pointer fast and slow to realize the removeNthFromEnd function;
//at first, slow = fast = start;
//and then, for(int i = 0; i < n; i++) fast = fast.next, fast move for n steps;
//finally, when fast.next != null, move slow and fast together;
public class removeNthFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode start = new ListNode(0);
        ListNode slow = start;
        ListNode fast = start;
        start.next = head;
        for(int i = 0; i < n; i++){
        	fast = fast.next;
        }
        while(fast.next != null){
        	slow = slow.next;
        	fast = fast.next;
        }
        slow.next = slow.next.next;
        return start.next;
    }
}
