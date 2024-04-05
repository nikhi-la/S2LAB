class Outer
{
	static int num1=10;
	
	class Inner
	{
		int num2=20;
		void display()
		{
			System.out.println(num1);
		}
	}
		

	static class StaticInner
	{
		int num3=30;
		void staticdisplay()
		{
			System.out.println(num1);
		}
	}
}

class Nested
{
	public static void main(String args[])
	{
		//static class object creation

		Outer.StaticInner s=new Outer.StaticInner();
		s.staticdisplay();
		//System.out.println(s.num3);
		
		//Non-static class object creation

		//Outer o=new Outer();
		//Outer.Inner i=o.new Inner();
		//i.display();
		
		//System.out.println(i.num2);
	}
}