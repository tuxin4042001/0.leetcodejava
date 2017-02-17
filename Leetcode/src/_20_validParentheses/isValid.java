package _20_validParentheses;

import java.util.Stack;

public class isValid {
	//Mehtod1: scan String s, if s.charAt(i) == '(' || '[' || '{', then push ')' || ']' || '}' into the stack;
	//         In the for loop, the stack will always have some element inside it, otherwise it should be the case as "](){}", it's false
	//         In the for loop, the stack.pop() should always equals to s.charAt(i), otherwise it should be the case as "(()" or "(]()"
	//核心思路：扫描 String s, 如果s.charAt(i)为如下字符'(','[','{', 在stack中加入他们的抵消字符')',']','}', 当for loop扫描到下一个字符的时候, 从stack
	//        中取出他们的抵消字符, 看是否跟s.charAt(i)一致, 一致继续, 不一致说明是false;
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for(int i = 0; i < s.length(); i++){
        	if(s.charAt(i) == '(')
        		stack.push(')');
        	else if(s.charAt(i) == '[')
        		stack.push(']');
        	else if(s.charAt(i) == '{')
        		stack.push('}');
        	else if(stack.isEmpty() || stack.pop() != s.charAt(i))
        		return false; 
        }
        return stack.isEmpty();
    }
    
    //Method2: scan String s, if s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{', push s.charAt(i) into stack
    //                        if s.charAt(i) == ')' || s.charAt(i) == ']' || s.charAt(i) == '}', see if stack.peek() equals to their open parenthese
    //                        if stack.peek() equals to their parenthese, stack.pop(), and continue, otherwise return false
    //                        also should notice that, if the char in String s is not a parenthese, like '-', will return false, save time 
    //核心思路：扫描String s, 如果s.charAt(i)是open parenthese, 就stack.push(s.charAt(i)), 如果是close parenthese, 就比较stack.peek()是否等于对应的
    //        open parenthese, 如果等于就stack.pop(), 如果不等于就return false
    public boolean isValid2(String s) {
        Stack<Character> stack = new Stack<Character>();
        for(int i = 0; i < s.length(); i++){
        	if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{')
        		stack.push(s.charAt(i));
            else if(s.charAt(i) == ')' && !stack.isEmpty() && stack.peek() == '(')
        		stack.pop();
        	else if(s.charAt(i) == ']' && !stack.isEmpty() && stack.peek() == '[')
        		stack.pop();
        	else if(s.charAt(i) == '}' && !stack.isEmpty() && stack.peek() == '{')
        		stack.pop();
        	else
        		return false;
        	
        }
        return stack.isEmpty();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
