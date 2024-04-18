package AreaPerimeter;

public class Rectangle
{
    public void area(int l,int b)
    {
        int area=l*b;
        
        System.out.println("Rectangle Area : "+area );
    }    
    public void perimeter(int l,int b)
    {
        int perimeter=2*(l+b);
        System.out.println("Rectangle Area : "+perimeter );
    }    
}