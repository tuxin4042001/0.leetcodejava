package _01_linkedList;

public class Link{
	public String bookName;
	public int millionSold;
	
	public Link next;
	
	public Link(String bookName, int millionSold){
		this.bookName = bookName;
		this.millionSold = millionSold;
	}
	public void display(){
		System.out.println(bookName + ": " + millionSold + ",000,000");
	}
	public String toString(){
		return bookName;
	}
}
