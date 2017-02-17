package _21_mergeTwoSortedList;



class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}


public class mergeTwoLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    	ListNode start = new ListNode(0);
    	ListNode currentNode = start;
    	while(l1 != null && l2 != null){
    		if(l1.val < l2.val){
    			currentNode.next = l1;
    			l1 = l1.next;
    			currentNode = currentNode.next;
    		}else{
    			currentNode.next = l2;
    			l2 = l2.next;
    			currentNode = currentNode.next;
    		}
    	}
        if(l1 == null){
        	currentNode.next = l2;
        }
        if(l2 == null){
        	currentNode.next = l1;
        }
        return start.next;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
