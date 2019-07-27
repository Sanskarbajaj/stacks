package stacks;

import java.util.Stack;

public class nextgreaterelement {
	public static  void nextgreater(int[] arr)
	{ int i=0;
		Stack<Integer> stack=new Stack();
		for(i=0;i<arr.length;i++)
		{
			while(!stack.isEmpty()&&stack.peek()<=arr[i])
			{
				int rv=stack.pop();
				System.out.println(rv+"->"+arr[i]);
						
			}
			stack.push(arr[i]);
			
		}
		while(!stack.isEmpty())
		{
			int rv=stack.pop();
			System.out.println(rv+"->"+(-1));
		}
	}

	public static void main(String[] args) {
		 int arr[] = {11, 13, 21, 3}; 
		 nextgreater(arr);
	}

}
