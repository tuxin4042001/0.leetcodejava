package _71_simplifyPath;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class simplifyPath {
	public class Solution {
		//解题思路：1.采用数据结构stack来处理这个问题；
		//      2.当stack不为空的时候，且s.equals(".."),出栈；
		//      3.当stack为空 s.equals("..") 或者 当stack不为空s.equals("") or s.equals("."), 入栈；
	    public String simplifyPath(String path) {
	        Stack<String> stack = new Stack<String>();
	        String[] array = path.split("/");
	        List<String> skip = new ArrayList(Arrays.asList("",".",".."));
	        for(String s : array){
	        	System.out.println("s in array: " + s);
	        	//这里判断的时候不能用s == ".."只能用s.equals("..")，后者才起作用
	        	if(s.equals("..") && !stack.isEmpty()){
	        		stack.pop();
	        	//这里判断的时候不能用s != "" or s != "." or s != "..", 可以用.equals或者!skip.contains
	        	}else if(!skip.contains(s)){
	        		stack.push(s);
	        	}
	        }
	        
	        String res = "";
	        for(String s : stack){
	        	System.out.println("s in stack: " + s);
	        	res += "/" + s;
	        }
	        
	        return res.isEmpty()?"/":res;
	    }
	    
	    public String simplifyPath2(String path) {
	        Stack<String> stack = new Stack<String>();
	        String[] array = path.split("/");
	        List<String> skip = new ArrayList(Arrays.asList("",".",".."));
	        for(String s : array){
	        	System.out.println("s in array: " + s);
	        	if(s.equals("..") && !stack.isEmpty()){
	        		stack.pop();
	        	}else if(!s.equals("") && !s.equals(".") && !s.equals("..")){
	        		stack.push(s);
	        	}
	        }
	        
	        String res = "";
	        for(String s : stack){
	        	System.out.println("s in stack: " + s);
	        	res += "/" + s;
	        }
	        
	        return res.isEmpty()?"/":res;
	    }
	}

	public static void main(String[] args) {
	}
}
	
