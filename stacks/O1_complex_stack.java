package stacks;

public class O1_complex_stack extends stackimplementation {

	public static void main(String[] args) throws Exception  {
		stackimplementation O1_stack=new stackimplementation();
		for(int i=1;i<9;i++)
		{
			O1_stack.addelement((1*i));
		}
		O1_stack.display();
		System.out.println(O1_stack.getlast());
		System.out.println(O1_stack.getmin());

	}

}
