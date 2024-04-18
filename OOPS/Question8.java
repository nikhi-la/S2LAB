import java.util.Scanner;

class Employee
{
	int eNo,eSalary;
	String eName;
	
    void getDetails()
    {
        Scanner s1=new Scanner(System.in);

        System.out.println("Enter Employee no.");
        eNo=s1.nextInt();

        System.out.println("Enter Employee Name.");
        s1.nextLine();
        eName=s1.nextLine();
        
        System.out.println("Enter Employee Salary.");
        eSalary=s1.nextInt();
    }

    void display()
    {
        System.out.println("Employee Number : "+eNo);

        System.out.println("Employee Name : "+eName);

        System.out.println("Employee Salary : "+eSalary+" Rs.");
    }
}

class Question8
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);

		System.out.println("Enter number of employees");
		int n=s.nextInt();
				
		Employee e[]=new Employee[n];
				

		for( int i=0;i<n;++i)
		{
           		e[i]=new Employee();

			System.out.println("\nEnter details for  Employee "+(i+1)+"\n");

            		e[i].getDetails();		
		}
		

		System.out.println("\n\nEnter Employee Number to be searched");
		int srch=s.nextInt();

		int flag=0;
		
		for( int i=0;i<n;++i)
		{
			if(e[i].eNo==srch)
			{	
				System.out.println("\n--------Record Found for Employee Number "+srch+"--------\n");
               			e[i].display();			
				
				flag=1;
				break;
			}		
		}

		if(flag==0)
			System.out.println("\nEmployee Not Found\n");

	
	}
}
