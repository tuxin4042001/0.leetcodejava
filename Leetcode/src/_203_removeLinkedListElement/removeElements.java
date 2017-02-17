package _203_removeLinkedListElement;

import _02_public_LinkList.ListNode;

public class removeElements {
    public ListNode removeElements(ListNode head, int val) {
        if(head == null) return null;
        ListNode currentNode = head;
        if(head.val == val) return head.next;
        while(currentNode.next != null){
        	if(currentNode.next.val == val){
        		currentNode.next = currentNode.next.next;
        	}
        	currentNode = currentNode.next;
        }
        return head;
    }
    
    public ListNode removeElements2(ListNode head, int val) {
        if(head == null) return null;
        head.next = removeElements2(head.next, val);
        if(head.val == val){
        	return head.next;
        }else{
        	return head;
        }
    }

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}

}
