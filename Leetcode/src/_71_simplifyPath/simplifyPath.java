package _71_simplifyPath;

import java.util.LinkedList;
import java.util.Stack;

public class simplifyPath {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<String>();
        String[] array = path.split("/");
        for(String str : array){
        	if(str == "."){
        		continue;
        	}else if(str == ".." && !stack.isEmpty()){
        		stack.pop();
        	}else if(!stack.contains(str)){
        		stack.push(str);
        	}
        }
        
        String result = "";
        for(String dir : stack){
        	result += "/" + dir;
        }
        
        return result;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "/a/./b/../../c/";
		String[] array = str.split("/");
        for(String s : array){
        	System.out.print(s + " ");
        }
	}

}
