import java.util.Scanner;

class UserInputExample
{
	int rollno;
	String name;
	float mark;

	void showDetails()
	{
		System.out.println("\n\nThis is Non Static Method");
		System.out.println("\n------Student Details------\n");
		System.out.println("Name :"+name);
		System.out.println("Roll No :"+rollno);
		System.out.println("Mark : "+mark);
	}
	static void show()
	{
		System.out.println("\n\nThis is Static Method");
	}	
	public static void main(String args[])
	{
		try
		{

			Scanner s=new Scanner(System.in);
			UserInputExample u=new UserInputExample();

			System.out.println("Enter Roll No");
			u.rollno=s.nextInt();
			System.out.println("Enter Name");
			u.name=s.next();
			System.out.println("Enter Mark");
			u.mark=s.nextFloat();
		
			u.showDetails();
			//Static method
			show();
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
}