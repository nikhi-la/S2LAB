import java.util.Scanner;

interface Area
{
	final double pi=3.14;

	void area();
	void perimeter();
}

class Circle implements Area
{
	int r;

	Circle(int a)
	{
		r=a;
	}
	public void area()
	{
		System.out.println("\nArea : "+pi*r*r);
	}

	public void perimeter()
	{
		System.out.println("Perimeter : "+2*pi*r+"\n");
	}
} 

class Rectangle implements Area
{
	int l,b;

	Rectangle(int l,int b)
	{
		this.l=l;
		this.b=b;
	}
	public void area()
	{
		System.out.println("\nArea : "+l*b);
	}

	public void perimeter()
	{
		System.out.println("Perimeter : "+2*(l+b)+"\n");
	}
} 

class Program7
{
	public static void main(String args[])
	{ 
		Scanner s=new Scanner(System.in);
		int ch;
		do{
			System.out.println("1.Circle\n2.Rectangle\n3.Exit\nEnter Choice");
			ch=s.nextInt();
			if (ch==1)
			{
				System.out.println("\nCircle\n");
				System.out.println("Enter radius");
				int r=s.nextInt();
				Circle c=new Circle(r);
				c.area();
				c.perimeter();
				
			}
			else if (ch==2)
			{
				System.out.println("\nRectangle\n");
				System.out.println("Enter length");
				int l=s.nextInt();
				System.out.println("Enter breadth");
				int b=s.nextInt();
				Rectangle r=new Rectangle(l,b);
				r.area();
				r.perimeter();
				
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