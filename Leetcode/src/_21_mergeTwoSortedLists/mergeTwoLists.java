package _21_mergeTwoSortedLists;

import _02_public_LinkList.ListNode;

//Method 1: without recursion
//create a locker ListNode start, it is used to lock the LinkList as the start of the LinkList
//create a current ListNode, it can be moved during the process
//Take care, after each comparison, the l1 need to be removed as l1 = l1.next as well as currentNode = currentNode.next
public class mergeTwoLists {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode start = new ListNode(0);
		ListNode currentNode = start;
		while (l1 != null && l2 != null) {
			if (l1.val < l2.val) {
				currentNode.next = l1;
				l1 = l1.next;
			} else {
				currentNode.next = l2;
				l2 = l2.next;
			}
			currentNode = currentNode.next;
		}
		if (l1 == null) {
			currentNode.next = l2;
		}
		if (l2 == null) {
			currentNode.next = l1;
		}
		return start.next;
	}

	//method 2: without while loop, instead, we consider to use recursion;
	//exclude the specific situation such as l1 == null && l2 == null;
	//use recursion instead of while loop to finish the merge process;
	public ListNode mergeTwoLists2(ListNode l1, ListNode l2) {

		if (l1 == null && l2 == null) {
			return null;
		}
		if (l1 == null) {
			return l2;
		}
		if (l2 == null) {
			return l1;
		}

		ListNode start;

		if (l1.val < l2.val) {
			start = l1;
			start.next = mergeTwoLists2(l1.next, l2);
		} else {
			start = l2;
			start.next = mergeTwoLists2(l1, l2.next);
		}

		return start;
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}

}
