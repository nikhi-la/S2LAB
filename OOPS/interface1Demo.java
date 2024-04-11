
interface interface1
{
	void display1();
}

interface interface2 extends interface1
{
	void display2();
}

class interfaceextends implements interface2
{
	public void display1()  //interface method should declared public
	{
		System.out.println("Inside Interface1");
	}
	public void display2()  //interface method should declared public
	{
		System.out.println("Inside Interface2");
	}	
	
}

class interface1Demo
{
	public static void main(String args[])
	{
		interfaceextends i=new interfaceextends();
		i.display1();
		i.display2();	
	}
}