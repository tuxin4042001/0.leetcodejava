package _150_evaluateReservePolishNotation;

import java.util.Stack;

//Method1: use stack to store the element in tokens, if tokens[i] = "+" || "-" || "*" || "/", stack.pop() op1 and op2, and then caculate and push the result into stack
//         if tokens[i] = nums instead of "+" || "-" || "*" || "/", then push them into stack
//核心思路：  如果tokens[i]是加减乘除符号, 就需要从stack中取出2个数进行计算, 结果再放回到stack中, 如果tokens[i]为数值而不是加减乘除, 直接放到stack中
public class evalRPN {
	public int evalRPN(String[] tokens) {
		Stack<Integer> stack = new Stack<Integer>();
		int op1, op2;
		for (int i = 0; i < tokens.length; i++) {
			switch (tokens[i]) {
			case "+":
				op1 = stack.pop();
				op2 = stack.pop();
				stack.push(op2 + op1);
				break;
			case "-":
				op1 = stack.pop();
				op2 = stack.pop();
				stack.push(op2 - op1);
				break;
			case "*":
				op1 = stack.pop();
				op2 = stack.pop();
				stack.push(op2 * op1);
				break;
			case "/":
				op1 = stack.pop();
				op2 = stack.pop();
				stack.push(op2 / op1);
				break;
			default:
				stack.push(Integer.parseInt(tokens[i]));
				break;
			}
		}
		return stack.pop();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
