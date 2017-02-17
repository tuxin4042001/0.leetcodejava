package _160_intersectionOfTwoLinkedLists;

import _02_public_LinkList.ListNode;

public class getIntersectionNode {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode currentNodeA = headA;
        ListNode currentNodeB = headB;
        if(currentNodeA == null && currentNodeB == null){
        	return null;
        }
        while(currentNodeA != currentNodeB){
        	if(currentNodeA == null){
        		currentNodeA = headB;
        	}else{
        		currentNodeA = currentNodeA.next;
        	}
        	
        	if(currentNodeB == null){
        		currentNodeB = headA;
        	}else{
        		currentNodeB = currentNodeB.next;
        	}
        }
        
        return currentNodeA;
    }

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}

}
