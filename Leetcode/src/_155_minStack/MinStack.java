package _155_minStack;

import java.util.Stack;

public class MinStack {
	public Stack<Integer> stack;
	public Stack<Integer> minStack;

	/** initialize your data structure here. */
	public MinStack() {
		stack = new Stack<Integer>();
		minStack = new Stack<Integer>();
	}

	public void push(int x) {
		stack.push(x);
		if(minStack.isEmpty()){
			minStack.push(x);
		}else{
			minStack.push(Math.min(x, minStack.peek()));
		}

	}

	public void pop() {
		minStack.pop();
		stack.pop();

	}

	public int top() {
		return stack.peek();

	}

	public int getMin() {
		return minStack.peek();

	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}

}
