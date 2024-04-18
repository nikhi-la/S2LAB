package AreaPerimeter;

public class Circle
{
	protected void area(int r)
	{
		double area=3.14*r*r;
		System.out.println("Circle area : "+area);
		
	}
	public void perimeter(int r)
	{
		double perimeter=2*3.14*r;
		System.out.println("Circle Perimeter : "+perimeter);
	}
}

