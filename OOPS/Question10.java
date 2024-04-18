import java.util.Scanner;

class Person
{
	String name;
	String gender;
	String address;
	int age;

	Person(String name,String gender,String address,int age)
	{
		this.name=name;
		this.gender=gender;
		this.address=address;
		this.age=age;	
	}
}

class Employee extends Person
{
	int emp_id;
	String company_name;
	String qualification;
	int salary;

	Employee(String name,String gender,String address,int age,int emp_id,String company_name,String qualification,int salary)
	{
		super(name,gender,address,age);
		this.emp_id=emp_id;
		this.company_name=company_name;
		this.qualification=qualification;
		this.salary=salary;
	}	
}

class Teacher extends Employee
{
	String subject;
	String department;
	int id;
 	
	Teacher(String name,String gender,String address,int age,int emp_id,String company_name,String qualification,int salary,String subject,String department,int id)
	{
		super(name,gender,address,age,emp_id,company_name,qualification,salary);
		this.subject=subject;
		this.department=department;
		this.id=id;
	}

	void display()
	{
		System.out.println("Name          : "+ name);
		System.out.println("Gender        : "+ gender);
		System.out.println("Address       : "+ address);
		System.out.println("Age           : "+ age);
		System.out.println("Employee Id   : "+ emp_id);
		System.out.println("Company Name  : "+ company_name);
		System.out.println("Qualification : "+ qualification);
		System.out.println("Salary        : "+ salary+" Rs.");
		System.out.println("Subject       : "+ subject);
		System.out.println("Department    : "+ department);
		System.out.println("Teacher Id    : "+ id);
	}
}


class Question10
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);

		System.out.println("Enter number of teachers");
		int n=s.nextInt();
		
		Teacher t[]=new Teacher[n];

		for(int i=0;i<n;++i)
		{
			System.out.println("\nTeacher "+(i+1)+"\n");

			System.out.println("Enter Name");
			s.nextLine();
			String name=s.nextLine();

			System.out.println("Enter Gender");
			String gender=s.next();

			System.out.println("Enter Address");
			s.nextLine();
			String address=s.nextLine();

			System.out.println("Enter Age");
			int age=s.nextInt();

			System.out.println("Enter Employee Id");
			int emp_id=s.nextInt();

			System.out.println("Enter Company Name");
			s.nextLine();
			String company_name=s.nextLine();

			System.out.println("Enter Qualification");
			String qualification=s.nextLine();

			System.out.println("Enter Salary");
			int salary=s.nextInt();

			System.out.println("Enter Subject");
			s.nextLine();
			String subject=s.nextLine();

			System.out.println("Enter Department");
			String department=s.nextLine();

			System.out.println("Enter Teacher Id");
			int teacherid=s.nextInt();

			//Object Creation
			t[i]=new Teacher(name,gender,address,age,emp_id,company_name,qualification,salary,subject,department,teacherid);
		}

		for(int i=0;i<n;++i)
		{
			System.out.println("\n-------Teacher "+(i+1)+"-------\n");
			t[i].display();
		}
	}
}
