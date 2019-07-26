package stacks;

public class dynamicstack extends stackimplementation{
	public void push(int value)
	{
		if(this.size()==data.length)
		{
			int [] arr=new int[2*data.length];
			for(int i=0;i<size();i++)
			{
				arr[i]=data[i];
			}
			data=arr;
		}
		top++;
		this.data[top]=value;
	}

	public static void main(String[] args) throws Exception{
		stackimplementation stack=new dynamicstack();
		for(int i=0;i<10;i++)
		{
			stack.push(i*1);
		}
		for(int i=0;i<10;i++)
		{
			stack.push(i*10);
		}
		for(int i=0;i<10;i++)
		{
			stack.push(i*100);
		}
		stack.display();

	}

}
