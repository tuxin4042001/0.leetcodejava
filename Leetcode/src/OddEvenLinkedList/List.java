package OddEvenLinkedList;

public class List {
	public ListNode firstNode;
	public List(){
		firstNode = null;
	}
	public void insertFirstNode(int val){
		ListNode newnode = new ListNode(val);
		//注意list插入节点的时候，先把尾巴连上然后把头接上，才可以形成链；
		newnode.next = firstNode;
		firstNode = newnode;
	}
	/**
	 * merge two sorted List;
	 * @param head1
	 * @param head2
	 * @return
	 */
	public ListNode mergeTwoLists(ListNode head1, ListNode head2){
		if(head1==null)return head2;
		if(head2==null)return head1;
		/**
		 * 利用迭代的方法来merge two sorted List;
		 */
		ListNode mergeList;
		if(head1.val>=head2.val){
			mergeList = head1;
			mergeList.next = mergeTwoLists(head1.next,head2);
		}
		else{
			mergeList = head2;
			mergeList.next = mergeTwoLists(head1,head2.next);
		}
		return mergeList;
	}
	public ListNode reverseList(ListNode head){
		/**
	    ListNode temp;
	    ListNode newhead = null;
	    while(head !=null){
	    	temp = head;
	    	temp.next = newhead;
	    	newhead = temp;
	    	head = head.next;
	    }
	    return newhead;
	    **/
		    ListNode temp;
		    ListNode newhead = null;
		    while(head !=null){
		    	temp = head.next;
		    	head.next = newhead;
		    	newhead = head;
		    	head = temp;
		    }
		    return newhead;
	}
	
	public ListNode reverseList_2(ListNode head){
		return connectList(head,null);
		
	}
	
	public ListNode connectList(ListNode head, ListNode newhead){
		/**
		 * 每次记录下head.next,然后抽取最外层的head与新的链表newhead连接；
		 */
		if(head==null){
			return newhead;
		}
		ListNode next = head.next;
		head.next = newhead;
		return connectList(next,head);
	}
	
	public ListNode removeDuplicate(ListNode head){
		ListNode list = head;
		while(list!=null){
			if(list.next==null){
				break;
			}
			/**
			if(head.val == next.val){
				head.next = next.next;
			}
			else{
				head=next;
			}
		}
		return next;
		**/
			if(list.val == list.next.val){
				list.next = list.next.next;
			}
			list = list.next;
		}
		return head;
	}

	public void display(){
		ListNode thenode = firstNode;
		while(thenode != null){
			thenode.display();
			//System.out.println("Next Node: " + thenode.next);
			thenode = thenode.next;
			System.out.println();
		}
	}
	public ListNode oddEvenLinkedList(ListNode head){
		//注意if可以不跟{}，将return放在外面，这样可以有返回值；
		if(head == null) return null;
		if(head.next == null || head.next.next == null) return head;
		ListNode oddHead, evenHead;
		ListNode oddfocusnode,evenfocusnode;
		oddHead = head;
		evenHead = head.next;
		oddfocusnode = oddHead;
		evenfocusnode = evenHead;
		while(evenfocusnode != null && evenfocusnode.next != null){
			oddfocusnode.next = oddfocusnode.next.next;
			evenfocusnode.next = evenfocusnode.next.next;
			oddfocusnode = oddfocusnode.next;
			evenfocusnode = evenfocusnode.next;
		}
		oddfocusnode.next = evenHead;
		return oddHead;		
	}
    public static void main(String args[]){
    	List list = new List();
    	List list_2 = new List();
    	list.insertFirstNode(1);
        list.insertFirstNode(2);
        list.insertFirstNode(2);
        list.insertFirstNode(4);
        list.insertFirstNode(5);
        list.insertFirstNode(6);
        //list.oddEvenLinkedList(list.firstNode);
    	list.display();
    	ListNode head = list.firstNode;
        //ListNode result = list.reverseList(head);
    	ListNode result = list.removeDuplicate(head);
    	list_2.firstNode = result;
    	list_2.display();
    }
}
