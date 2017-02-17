package _24_swapNodeInPairs;

import _02_public_LinkList.ListNode;

//separate the first node and second node from the link list, only consider the swap between first
//node and second, they won't affect the linklist follow with them.
public class swapPairs {
	public ListNode swapPairs(ListNode head) {
		ListNode start = new ListNode(0);
		ListNode currentNode = start;
		start.next = head;
		while (currentNode.next != null && currentNode.next.next != null) {
			ListNode first = currentNode.next;
			ListNode second = currentNode.next.next;
			first.next = second.next;
			currentNode.next = second;
			currentNode.next.next = first;
			currentNode = currentNode.next.next;
		}
		return start.next;
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}

}
