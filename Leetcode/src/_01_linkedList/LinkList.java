package _01_linkedList;

public class LinkList {
public Link firstLink;
LinkList(){
	firstLink = null;
}
public boolean isEmpty(){
	return(firstLink == null);
}
public void insertFirstLink(String bookName, int millionSold){
	Link newLink = new Link(bookName,millionSold);
	newLink.next = firstLink;
	firstLink = newLink;
}
public Link removeFirst(){
	Link linkReference = firstLink;
	if(!isEmpty()){
		firstLink = firstLink.next;
	}else{
		System.out.println("Empty LinkList!");
	}
	return linkReference;
}
public void display(){
	Link theLink = firstLink;
	while(theLink !=null){
		theLink.display();
		System.out.println("Next Link: " + theLink.next);
		theLink = theLink.next;
		System.out.println();
	}
}
public Link find(String bookName){
	Link theLink = firstLink;
	if(!isEmpty()){
		while(theLink.bookName != bookName){
			if(theLink.next == null){
				return null;
			}else{ theLink = theLink.next;
				
			}
		}
	}else{
		System.out.println("Empty Linked List");
	}
	return theLink;
}
public Link removeLink(String bookName){
	Link currentLink = firstLink;
	Link previousLink = firstLink;
	while(currentLink.bookName != bookName){
		if(currentLink.next == null){
			return null;
		}else{
			previousLink = currentLink;
			currentLink = currentLink.next;
		}
	}
	if(currentLink == firstLink){
		firstLink = firstLink.next;
	}else{
		previousLink.next = currentLink.next;
	}
	return currentLink;
}
public static void main(String args[]){
	LinkList theLinkList = new LinkList();
	theLinkList.insertFirstLink("text1", 1);
	theLinkList.insertFirstLink("text2", 1);
	theLinkList.insertFirstLink("text3", 1);
	theLinkList.insertFirstLink("text4", 1);
	
	theLinkList.display();
	//theLinkList.removeFirst();
	//theLinkList.removeFirst().display();
	//theLinkList.display();
	//theLinkList.find("text1").display();
	//System.out.println(theLinkList.find("text1"));
	theLinkList.removeLink("text2");
	theLinkList.display();
}
}
