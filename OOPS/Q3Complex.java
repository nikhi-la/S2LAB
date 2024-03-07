class Complex
{
	double real;
	double imag;

	//Constructor

	Complex(double a,double b)
	{
		real=a;
		imag=b;
	}
	
}


class Q3Complex
{
	public static void main(String args[])
	{
		Complex c1=new Complex(2.1,4.3);
		Complex c2=new Complex(1.0,4.0);
		Complex result;

		result=add(c1,c2);
		System.out.println("\n\tSum is "+result.real+" + "+result.imag+"i");
	}
	
	public static Complex add(Complex n1,Complex n2)
	{
		Complex res=new Complex(0.0,0.0);
		res.real=n1.real+n2.real;
		res.imag=n1.imag+n2.imag;
		
		System.out.println("Complex Number 1 :\t"+n1.real+" + "+n1.imag+"i");
		System.out.println("Complex Number 2 :\t"+n2.real+" + "+n2.imag+"i");

		return res;
	}
}