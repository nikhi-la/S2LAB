import java.util.Scanner;

class Product
{
	int pcode;
	String pname;
	int price;

	int acceptValues()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Product Code");
		pcode=s.nextInt();
		s.nextLine();
		System.out.println("Enter Product Name");
		pname=s.nextLine();
		System.out.println("Enter Product Price");
		price=s.nextInt();

		return price;

	}
	void display()
	{
		System.out.println("Product Code :"+pcode);
		System.out.println("Product Name :"+pname);
		System.out.println("Price :"+price+" Rs.");
	}
}

class Q2Product
{
	public static void main(String args[])
	{
		Product p1=new Product();
		Product p2=new Product();
		Product p3=new Product();

		System.out.println("Product 1");
		int price1=p1.acceptValues();
		System.out.println("Product 2");
		int price2=p2.acceptValues();
		System.out.println("Product 3");
		int price3=p3.acceptValues();
		
		System.out.println("\n********Lowest Price********");

		if ((price1<price2)&&(price1<price3))
		{	
			System.out.println("\n--------Product 1--------\n");
			p1.display();
		}
		else if ((price2<price1)&&(price2<price3))
		{
			System.out.println("\n--------Product 2--------\n");
			p2.display();	
		}
		else if((price3<price1)&&(price3<price2))
		{
			System.out.println("\n--------Product 3--------\n");
			p3.display();
		}		
	}
}