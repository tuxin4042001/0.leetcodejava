package _92_reverseLinkedList2;

//class ListNode {
//     int val;
//     ListNode next;
//     ListNode(int x) { val = x; }
// }

public class reverseBetween2 {
    public static void reverseBetween(ListNode head, int m, int n) {
        //if(head == null) return null;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;
        
        for(int i = 0; i < m - 1; i++){
        	pre = pre.next;
        }
        
        ListNode start = pre.next;
        ListNode then = start.next;
        
        for(int i = 0; i < n - m; i++){
        	System.out.println(i+1+" time result: ");
        	System.out.println("dummy is:");
        	display(dummy);
        	System.out.println("head is:");
        	display(head);
        	System.out.println("pre is:");
        	display(pre);
        	System.out.println("start is:");
        	display(start);
        	System.out.println("then is:");
        	display(then);
        	start.next = then.next;
        	then.next = start;
        	display(then);
        	pre.next = then;
        	then = start.next;
        }
        
        //return dummy.next;
    }
    
    public static void display(ListNode head){
    	while(head != null){
    		if(head.next == null){
    			System.out.print(head.val);
    			break;
    		}
    		System.out.print(head.val + "-->");
    		head = head.next;
    	}
    	System.out.println();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode headTest = new ListNode(1);
		ListNode currentNode = headTest;
		for(int i = 0; i < 4; i++){
			ListNode tempNode = new ListNode(i+2);
			currentNode.next = tempNode;
			currentNode = currentNode.next;
		}
		
		display(headTest);
		
		reverseBetween(headTest,1,4);

	}

}
