package stacks;

import java.util.Stack;

public class postfixtoinfix {
	public static boolean isoperator(char ch)
	{
		if(ch=='+'||ch=='-'||ch=='/'||ch=='^'||ch=='*')
		{
			return true;
		}
		return false;
	}
	public  static String postfixtoinfix(String str)
	{
		String res=new String("");
	    Stack<String> stack=new Stack<>();
	    for(int i=0;i<str.length();i++)
	    { char ch=str.charAt(i);
	    if(isoperator(ch))
	    { String op1=stack.peek()+""; stack.pop();
	    String op2=stack.peek()+""; stack.pop();
	     res='('+op2+ch+op1+')';
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
		String str = "ab*c+"; 
		System.out.println(postfixtoinfix(str));

	}

}
