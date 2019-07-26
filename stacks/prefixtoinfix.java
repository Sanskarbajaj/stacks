package stacks;

import java.util.Stack;

public class prefixtoinfix {
	public static boolean isoperator(char ch)
	{
		if(ch=='+'||ch=='-'||ch=='/'||ch=='^'||ch=='*')
		{
			return true;
		}
		return false;
	}
	public  static String prefixtoinfix(String str)
	{
		String res=new String("");
	    Stack<String> stack=new Stack<>();
	    for(int i=str.length()-1;i>=0;i--)
	    { char ch=str.charAt(i);
	    if(isoperator(ch))
	    { String op1=stack.peek()+""; stack.pop();
	    String op2=stack.peek()+""; stack.pop();
	     res='('+op1+ch+op2+')';
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
		String str= "*-A/BC-/AKL";
		String ans=prefixtoinfix(str);
		System.out.println(ans);
		

	}

}
