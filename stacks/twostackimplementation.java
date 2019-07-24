package stacks;

public class twostackimplementation {
	int data[];
	int top1,top2;
	public static final int defaultcapacity=10;
	public twostackimplementation() {
	this(defaultcapacity);
	}
	public twostackimplementation(int defaultcapacity) {
		 data=new int[defaultcapacity];
		 top1=-1;
		 top2=data.length-1;
	}
	public void push1(int value) throws Exception
	{
		if(top1<top2)
		{
			top1++;
			this.data[top1]=value;
		}
		else
		{
			throw new Exception("stack overflow");
		}
	}
	public void push2(int value) throws Exception
	{
		if(top2>data.length)
		{
			throw new Exception("stack overflow");
		}
		else	if(top1<top2)
		{
			this.data[top2]=value;
			top2--;
		}
	}
	public int  pop1() throws Exception
	{
		if(top1<0)
		{
			throw new Exception("stack underflow");
		}
		int rv=0;
		if(top1>=0)
		{
		 rv=this.data[top1];
			top1--;
		}
		return rv;
	}
	public int  pop2() throws Exception
	{
		if(top2>data.length-1)
		{
			throw new Exception("stack underflow");
		}
		int rv=0;
		if(top2<=data.length-1)
		{
		 rv=this.data[top1];
			top2++;
		}
		return rv;
	}
	public void display1()
	{
		for(int i=top1;i>=0;i--)
		{
			System.out.print(data[i]+"=>");
		}
		System.out.println("End");
	}
	public void display2()
	{
		for(int i=top2+1;i<=data.length-1;i++)
		{
			System.out.print(data[i]+"=>");
		}
		System.out.println("End");
	}
	public static void main(String[] args) throws Exception {
		twostackimplementation twostack=new twostackimplementation();
		twostack.push1(10);
		twostack.push1(20);
		twostack.push1(30);
		twostack.push1(40);
		twostack.push1(50);
		twostack.push1(60);
		twostack.push1(70);
		twostack.pop1();
		twostack.pop1();
		twostack.pop1();
		twostack.pop1();
	   twostack.display1();
	   twostack.push2(80);
	   twostack.push2(90);
	   twostack.push2(80);
	   twostack.push2(90);
	   twostack.push2(80);
	   twostack.push2(90);
	   twostack.display2();

	}

}
