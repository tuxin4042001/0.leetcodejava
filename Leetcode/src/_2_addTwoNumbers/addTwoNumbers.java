package _2_addTwoNumbers;


class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
}


public class addTwoNumbers {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2){
		int valL1 = 0;
		int valL2 = 0;
		int carry = 0;
		int sum = 0;
		ListNode sum1 = new ListNode(0);
		ListNode currNodeSum = sum1;
		if(l1 == null) return l2;
		if(l2 == null) return l1;
		while(l1 != null || l2 != null){
			if(l1 != null){
				valL1 = l1.val;
				l1 = l1.next;
	        }else{
	        	valL1 = 0;
	        }
	        
	        if(l2 != null){
	        	valL2 = l2.val;
	            l2 = l2.next;
	        }else{
	        	valL2 = 0;
	        }
	        
	        sum = valL1 + valL2 + carry;
	        carry = sum/10;
	        sum = sum%10;
	        
	        currNodeSum.next = new ListNode(sum);
	        currNodeSum = currNodeSum.next;
	     }
		
		if(carry == 1){
			currNodeSum.next = new ListNode(carry);
		}
	     return sum1.next;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
