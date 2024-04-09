//Abstract

abstract class A
{
	void displayA()
	{
		System.out.println("Inside Abstarct class A");
	}
	abstract void abstractA();
		
}

class B extends A
{
	void abstractA()
	{
		System.out.println("Inside Abstract A");
	}
	void displayB()
	{
		System.out.println("Inside class B");
	}

}

class AbstractDemo
{
	public static void main(String args[])
	{
		B b=new B();
		b.displayA();
		b.displayB();

		A a=new B(); //Reference A
		a.abstractA();
	}
} 