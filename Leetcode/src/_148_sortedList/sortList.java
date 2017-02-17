package _148_sortedList;


class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class sortList {
	//method1: consider bubble sorted method, the only problem for this method is it will out of time limit
	//cause there is too many loop in it, if the ListNode head is too long;
    public ListNode sortList(ListNode head) {
        int length = 0;
        ListNode currentNode = head;
        while(currentNode != null){
        	currentNode = currentNode.next;
        	length++;
        }
        
        for(int i = length; i > 0; i--){
        	currentNode = head;
        	for(int j = 0; j < i; j++){
        		int temp;
        		if(currentNode.val > currentNode.next.val){
        			temp = currentNode.next.val;
        			currentNode.next.val = currentNode.val;
        			currentNode.val = temp;
        		}
        		currentNode = currentNode.next;
        	}
        }
        
        return head;
    }
    
    //method2: at first, we separate the ListNode head into two part, then sort them separately and then merge these two sorted list
    public ListNode sortList2(ListNode head) {
    	if(head == null && head.next == null) return head;
        ListNode pre = head;
        ListNode then = head.next.next;
        while(then != null && then.next != null){
        	pre = pre.next;
        	then = then.next.next;
        }
        ListNode h2 = sortList2(pre.next);
        pre.next = null;
        return mergeList(sortList2(head),h2);
    }
    
//    public ListNode mergeList(ListNode l1, ListNode l2){
//    	if(l1 == null && l2 == null) return null;
//    	if(l1 == null) return l2;
//    	if(l2 == null) return l1;
//    	
//    	ListNode start = new ListNode(0);
//    	while(l1 != null && l2 != null){
//    		if(l1.val < l2.val){
//    			start = l1;
//    			start.next = mergeList(l1.next, l2);
//    		}else{
//    			start = l2;
//    			start.next = mergeList(l2.next, l1);
//    		}
//    	}
//    	return start;
//    }
    
    public ListNode mergeList(ListNode l1, ListNode l2){
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
