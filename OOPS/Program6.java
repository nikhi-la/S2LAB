import java.util.Scanner;

class Employee
{
	int eNo,eSalary;
	String eName;
	
	Employee(int no,String name,int salary)
	{
		eNo=no;
		eName=name;
		eSalary=salary;
	}
}

class Program6
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);

		System.out.println("Enter number of employees");
		int n=s.nextInt();
				
		Employee e[]=new Employee[n];
				

		for( int i=0;i<n;++i)
		{
			System.out.println("\nEnter details for  Employee "+(i+1)+"\n");

			System.out.println("Enter Employee no.");
			int eno=s.nextInt();

			System.out.println("Enter Employee Name.");
			s.nextLine();
			String ename=s.nextLine();
			
			System.out.println("Enter Employee Salary.");
			int esalary=s.nextInt();

			e[i]=new Employee(eno,ename,esalary);
		}
		

		System.out.println("\n\nEnter Employee Number to be searched");
		int srch=s.nextInt();

		int flag=0;
		
		for( int i=0;i<n;++i)
		{
			if(e[i].eNo==srch)
			{	
				System.out.println("\n--------Record Found for Employee Number "+srch+"--------\n");

				System.out.println("Employee Number : "+e[i].eNo);
	
				System.out.println("Employee Name : "+e[i].eName);

				System.out.println("Employee Salary : "+e[i].eSalary+" Rs.");
				
				flag=1;
				break;
			}		
		}

		if(flag==0)
			System.out.println("\nEmployee Not Found\n");

	
	}
}