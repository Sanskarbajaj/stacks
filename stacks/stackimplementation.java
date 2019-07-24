package stacks;

public class stackimplementation {
	int data[];
	int top;
	public static final int defaultcapacity=10;
	public stackimplementation() {
	   this(defaultcapacity);
	}
	public stackimplementation(int defaultcapacity) {
		data=new int[defaultcapacity];
		top=-1;
	}
	public int size()
	{
		return top+1;
	}
	int min=Integer.MAX_VALUE;
	public void addelement(int value) throws Exception
	{
		if(this.size()==this.data.length)
	{
		throw new Exception("stack overflow");
	}
		if(value<min)
		{
			min=value;
			
		}
		top++;
		this.data[this.top]=value;
	}
	public int  getlast() throws Exception
	{
		int rv=this.pop();
		return rv;
	}
	public void removelast() throws Exception
	{
		this.pop();
	}
	public int getmin()
	{
		return min;
	}


	public boolean isEmpty()
	{
		if(top==-1)
			return true;
		return false;
	}
	public  void push(int value) throws Exception
	{ if(this.size()==this.data.length)
	{
		throw new Exception("stack overflow");
	}
		top++;
		this.data[this.top]=value;
	}
public int pop() throws Exception
{ if(isEmpty())
{
	throw new Exception("stack underflow");
}
	
	int rv=this.data[this.top];
	this.data[this.top]=0;
	this.top--;
	return rv;
}
public void display()
{
	for(int i=size()-1;i>=0;i--)
	{
		System.out.print(data[i]+"=>");
	}
	System.out.println("End");
}

	public static void main(String[] args) throws Exception {
		stackimplementation stack=new stackimplementation();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.push(60);
		stack.push(70);
		stack.push(80);
		stack.push(90);
		stack.push(100);
		//stack.push(110);
		stack.display();
		stack.pop();
		stack.display();
		stack.pop();
		stack.display();
		stack.pop();
		stack.display();
		stack.pop();
		stack.display();
		stack.pop();
		stack.display();
		stack.pop();
		stack.display();
		stack.pop();
		stack.display();
		stack.pop();
		stack.display();
	int ans=	stack.pop();
		stack.display();
		System.out.println(stack.top);
		System.out.println(stack.size());
		System.out.println(stack.isEmpty());

		
	}

}
