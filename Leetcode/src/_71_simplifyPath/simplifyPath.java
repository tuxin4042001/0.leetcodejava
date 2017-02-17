package _71_simplifyPath;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class simplifyPath {
	public class Solution {
		//����˼·��1.�������ݽṹstack������������⣻
		//      2.��stack��Ϊ�յ�ʱ����s.equals(".."),��ջ��
		//      3.��stackΪ�� s.equals("..") ���� ��stack��Ϊ��s.equals("") or s.equals("."), ��ջ��
	    public String simplifyPath(String path) {
	        Stack<String> stack = new Stack<String>();
	        String[] array = path.split("/");
	        List<String> skip = new ArrayList(Arrays.asList("",".",".."));
	        for(String s : array){
	        	System.out.println("s in array: " + s);
	        	//�����жϵ�ʱ������s == ".."ֻ����s.equals("..")�����߲�������
	        	if(s.equals("..") && !stack.isEmpty()){
	        		stack.pop();
	        	//�����жϵ�ʱ������s != "" or s != "." or s != "..", ������.equals����!skip.contains
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
	
