package _04_stack;

import java.util.Arrays;

public class theStack {
	private String[] stackArray;
	private int stackSize;
	private int topOfStack;

	theStack(int size) {
		stackSize = size;
		stackArray = new String[size];
		Arrays.fill(stackArray, "-1");
	}

	public void push(String input) {
		if (topOfStack + 1 < stackSize) {
			topOfStack++;
			stackArray[topOfStack] = input;
		} else {
			System.out.println("Sorry, but the stack is full!");
		}

		// displayTheStack();

		System.out.println("Push " + input + " into the stack!");
	}

	public String pop() {
		if (topOfStack >= 0) {
			// displayTheStack();
			System.out.println("Pop " + stackArray[topOfStack]
					+ " was removed from stack");
			stackArray[topOfStack] = "-1";
			return stackArray[topOfStack--];
		} else {
			// displayTheStack();
			System.out.println("Sorry but the stack is empty!");
			return "-1";
		}
	}

	public String peek() {
		// displayTheStack();
		System.out.println("Peek " + stackArray[topOfStack]
				+ " is at the top of the stack!");
		return stackArray[topOfStack];
	}

	public void pushMany(String multipleValues) {
		String[] tempString = multipleValues.split(" ");
		for (int i = 0; i < tempString.length; i++) {
			push(tempString[i]);
		}
	}
	
	public void popAll(){
		for(int i = topOfStack; i >= 0; i--){
			pop();
		}
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		theStack theStack = new theStack(10);
		theStack.push("10");
		theStack.push("15");
		theStack.peek();
		theStack.pop();
		theStack.peek();
		
		theStack.pushMany("12 13 14 15");
		theStack.popAll();

	}

}
