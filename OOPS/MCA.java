class MCA
{
	int rollno;
	String name;
	double mark;


	
	static void staticshow()
	{
		System.out.println("This is inside static");
	}



 	void show()
	{
		System.out.println("\nThis is Non Static\n");
		System.out.println("Roll No : "+rollno);
		System.out.println("Name : "+name);
		System.out.println("Mark : "+mark);
	}


	void add()
	{
		System.out.println("\n\nAfter Adding 10 Marks");
		mark=mark+10;
	}	


	public static void main(String a[])
	{
		MCA s1=new MCA();
		s1.rollno=Integer.parseInt(a[0]);
		s1.name=a[1];
		s1.mark=Double.parseDouble(a[2]);
		staticshow();
		s1.show();
		
		s1.add();
		s1.show();
	}

	
	
}