package _05_queue;

import java.util.Arrays;

public class queue {
	private String[] queueArray;
	private int queueSize;
	private int front, rear, numberOfItems = 0;

	queue(int size) {
		queueSize = size;
		queueArray = new String[size];
		Arrays.fill(queueArray, "-1");
	}

	public void insert(String input) {
		if (numberOfItems + 1 <= queueSize) {
			queueArray[rear] = input;
			rear++;
			numberOfItems++;
			System.out
					.println("Insert " + input + " was added into the queue!");
		} else {
			System.out.println("Sorry, but the queue is full!");
		}
	}

	public void remove() {
		if (numberOfItems > 0) {
			System.out.println("Remove " + queueArray[front]
					+ " was removed from queue!");
			queueArray[front] = "-1";
			front++;
			numberOfItems--;
		} else {
			System.out.println("Sorry, but the queue is empty!");
		}
	}

	public void peek() {
		System.out.println("The first element is " + queueArray[front]);
	}
	
	public void priorityInsert(String input){
		int i;
		if(numberOfItems == 0){
			insert(input);
		}else{
			 for(i = numberOfItems - 1; i >= 0; i--){
				 if(Integer.parseInt(input) > Integer.parseInt(queueArray[i])){
					 queueArray[i+1] = queueArray[i];
				 }else{
					 break;
				 }
				 queueArray[i] = input;
				 rear++;
				 numberOfItems++;
			 }
		}
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		queue queue = new queue(10);
		queue.priorityInsert("10");
		queue.priorityInsert("15");
		queue.priorityInsert("11");
		
		queue.remove();
		queue.remove();
		queue.remove();
		
//		queue.remove();
//		queue.peek();
//		
//		queue.remove();
//		queue.peek();
//		
//		queue.remove();
//		queue.peek();

	}

}
