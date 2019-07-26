package stacks;

import java.util.Stack;

public class balanceparanthesis {
	public  static boolean isMatchingPair(char character1, char character2) 
	    { 
	       if (character1 == '(' && character2 == ')') 
	         return true; 
	       else if (character1 == '{' && character2 == '}') 
	         return true; 
	       else if (character1 == '[' && character2 == ']') 
	         return true; 
	       else
	         return false; 
	    } 
	public static boolean isbalanced(String str)
	{  Stack<Character> stack=new Stack<>();
		for(int i=0;i<str.length();i++)
         {
	char ch=str.charAt(i);
	if(ch=='('||ch=='{'||ch=='[')
	{
		stack.push(ch);
	}
	else if(ch==')'||ch=='}'||ch==']')
	{
		if(stack.isEmpty())
		{
			return false;
		}
		else if(!isMatchingPair(stack.pop(),ch))
		{
			return false;
		}
	}
           }
			
	return true;
	}

	public static void main(String[] args) {
		String str="[{{()}}]"; 
        if (isbalanced(str)) 
          System.out.println("Balanced "); 
        else
          System.out.println("Not Balanced ");
	}

}
