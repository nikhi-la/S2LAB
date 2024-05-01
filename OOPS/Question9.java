import java.util.Scanner;

class Area
{
	final double pi=3.14;
    //Circle
	void area(int r)
    {
        System.out.println("Area : "+pi*r*r+"\n");
    }
    //Rectangle
	void area(int l,int b)
    {
        System.out.println("Area : "+l*b+"\n");
    }
}


class Question9
{
	public static void main(String args[])
	{ 
		Scanner s=new Scanner(System.in);
        Area a=new Area();
		int ch;

		do{
			System.out.println("1.Circle\n2.Rectangle\n3.Exit\nEnter Choice");
			ch=s.nextInt();
			if (ch==1)
			{
				System.out.println("\nCircle");
				System.out.println("Enter radius");
				int r=s.nextInt();
				a.area(r);
				
			}
			else if (ch==2)
			{
				System.out.println("\nRectangle\n");
				System.out.println("Enter length");
				int l=s.nextInt();
				System.out.println("Enter breadth");
				int b=s.nextInt();
				a.area(l,b);				
			}
			else if(ch==3)
			{	
				System.out.println("\nExited\n");
				break;
			}
			else
			{
				System.out.println("\nInvalid Choice\n");
			}
		}while(ch!=3);
	}
}