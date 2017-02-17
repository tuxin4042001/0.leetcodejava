package _206_reverseLinkedList;

class ListNode {
int val;
ListNode next;
ListNode(int x) { val = x; }
}

public class reverseList {
	public ListNode reverseList(ListNode head){
		if(head == null) return null;
		ListNode newHead = null;
		while(head != null){
			ListNode next = head.next;
			head.next = newHead;
			newHead = head;
			head = next;
	    }
	    return newHead;
	}
	
    public ListNode reverseList2(ListNode head) {
        if(head == null || head.next == null){
        	return head;
        }
        ListNode pre = null;
        //issue1:here we use head != null as judging condition, not head.next != null, otherwise we will miss the last
        //element in the ListNode head
        while(head != null){
        	ListNode temp = head.next;
        	head.next = pre;
        	pre = head;
        	head = temp;
        }
        return pre;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
