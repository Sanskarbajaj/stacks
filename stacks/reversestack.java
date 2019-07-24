package stacks;

public class reversestack extends stackimplementation {

	public static void main(String[] args) throws Exception{
		//here we are reversing a stack using two helper stacks 
		stackimplementation stack=new stackimplementation();//orignal stack
		stackimplementation temp=new stackimplementation();//helper1 stack
		stackimplementation temp1=new stackimplementation();//helper2 stack
		//pushing values in orig stack
		for(int i=0;i<10;i++)
		{
		stack.push(1*i);
		}
		//using helper1 stack pushing in temp and poping from stack 
		for(int i=0;i<10;i++)
		{
			temp.push(stack.pop());
		}
		//using helper2 stack pushing in temp1 and poping from temp
		for(int i=0;i<10;i++)
		{
			temp1.push(temp.pop());
		}
		//using helper2 stack pushing in orig stack and poping from temp1
		for(int i=0;i<10;i++)
		{
			stack.push(temp1.pop());
		}
		stack.display();
		//it will take O(n) time complexity  //worst case basically  O(4n)
	}

}
