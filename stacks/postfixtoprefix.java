package stacks;

import java.util.Stack;

public class postfixtoprefix {
	public static boolean isoperator(char ch)
	{
		if(ch=='+'||ch=='-'||ch=='/'||ch=='^'||ch=='*')
		{
			return true;
		}
		return false;
	}
	public  static String postfixtoprefix(String str)
	{
		String res=new String("");
	    Stack<String> stack=new Stack<>();
	    for(int i=0;i<str.length();i++)
	    { char ch=str.charAt(i);
	    if(isoperator(ch))
	    { String op1=stack.peek()+""; stack.pop();
	    String op2=stack.peek()+""; stack.pop();
	     res=ch+op2+op1;
	    	stack.push(res);
	    }
	    else
	    { 
	    	stack.push(ch+"");
	    	
	    }
	    	
	    }
	return stack.peek();
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "ABC/-AK/L-*"; 
		System.out.println(postfixtoprefix(str));

	}

}
