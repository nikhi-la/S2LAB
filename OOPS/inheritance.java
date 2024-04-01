class A
{
	int var1=20;

	void display()
	{
		System.out.println("The value of variable 1 : "+var1);
	}

	void show()
	{
		System.out.println("Inside class A");
	}
	
}

class B extends A
{
	int var2=10;
	
	void display()
	{
		super.display(); //invoke parent class display to prevent overriding
		System.out.println("The value of variable 2 : "+var2);
	}

	//method overriding
	void show()
	{
		System.out.println("Inside class B");
	}
}

class inheritance
{
	public static void main(String args[])
	{
		B b=new B();
		b.show();
		b.display();
		System.out.println("Variable 1 :" + b.var1);
		System.out.println("Variable 2 :" + b.var2); // inherited by class B
	}
}