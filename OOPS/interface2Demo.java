interface interface1
{
	void display1();
}

interface interface2
{
	void display2();
}

class A
{
	void display()
	{
		System.out.println("Inside Class A");
	}
}

class int_demo extends A implements interface1,interface2
{
	public void display1()
	{
		System.out.println("Inside Interface1");
	}
	public void display2()
	{
		System.out.println("Inside Interface2");
	}
}

class interface2Demo
{
	public static void main(String args[])
	{
		int_demo i=new int_demo();
		i.display();
		i.display1();
		i.display2();
	}
}