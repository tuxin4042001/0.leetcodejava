package _61_rotateList;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
 }

public class rotateRight {
	//issue1: when int k is larger than the length of the ListNode head, there will be no pointer exception
	//should consider the cycle example
    public ListNode rotateRight(ListNode head, int k) {
    	if(head == null || head.next == null) return head;
    	
        ListNode start = new ListNode(0);
        start.next = head;
        ListNode slow = start;
        ListNode fast = start;
        
        for(int i = 0; i < k; i++){
        	fast = fast.next;
        }
        
        while(fast.next != null){
        	slow = slow.next;
        	fast = fast.next;
        }
        
        fast.next = start.next;
        start.next = slow.next;
        slow.next = null;
        
        return start.next;
    }
    
    public static ListNode rotateRight2(ListNode head, int k) {
        if(head == null || head.next == null) return head;
        ListNode start = new ListNode(0);
        start.next = head;
        ListNode slow = start;
        ListNode fast = start;
        int listLength = 0;
        
        //get the length of the ListNode head
        while(fast.next != null){
        	fast = fast.next;
        	listLength++;
        }
        
        for(int i = listLength - (k % listLength); i > 0; i--){
        	slow = slow.next;
        }
        
        fast.next = start.next;
        while(start.next != null){
        	System.out.print(start.val + " ");
        	start = start.next;
        }
        start.next = slow.next;
        slow.next = null;
        
        return start.next;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(0);
		ListNode begin = new ListNode(0);
		begin = head;
		int[] nums = {1,2,3,4,5};
		for(int i = 0; i < nums.length; i++){
			ListNode temp = new ListNode(nums[i]);
			head.next = temp;
			head = head.next;
		}
//		while(begin != null){
//			if(begin.next == null){
//				System.out.print(begin.val);
//				break;
//			}
//			System.out.print(begin.val + "-->");
//			begin = begin.next;
//		}
		
		ListNode start = begin;
		ListNode fast = start;
		ListNode slow = start;
		
		System.out.println("start is: " + start.val);
		for(int i = 0; i < 5; i++){
			fast = fast.next;
		}
		System.out.println("fast is: " + fast.val);
		
		for(int i = 0; i < 3; i++){
			slow = slow.next;
		}
		System.out.println("slow is: " + slow.val);
		
		fast.next = start.next;
		System.out.print(start.val);
		System.out.print(start.next.val);
		System.out.print(start.next.next.val);
		System.out.print(start.next.next.next.val);
		System.out.print(start.next.next.next.next.val);
		System.out.print(start.next.next.next.next.next.val);
		System.out.println(start.next.next.next.next.next.next.val);
		
		start.next = slow.next;
		System.out.print(start.val);
		System.out.print(start.next.val);
		System.out.print(start.next.next.val);
		System.out.print(start.next.next.next.val);
		System.out.print(start.next.next.next.next.val);
		System.out.print(start.next.next.next.next.next.val);
		System.out.println(start.next.next.next.next.next.next.val);
		System.out.println("slow is: " + slow.val);
		
		slow.next = null;
		System.out.print(start.val);
		System.out.print(start.next.val);
		System.out.print(start.next.next.val);
		System.out.print(start.next.next.next.val);
		System.out.print(start.next.next.next.next.val);
		System.out.print(start.next.next.next.next.next.val);
	}

}
