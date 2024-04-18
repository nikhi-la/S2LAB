import java.util.Arrays;
class Question6
{
    public static void main(String args[])
    {
            
        String fruits[]={"Apple","Orange","Grapes","Strawberry","Kiwi"};

        System.out.println("Before sorting");
        System.out.print("\t");

        for(int i=0;i<fruits.length;++i)
        {
            System.out.print(fruits[i]+" ");
        }
         System.out.println();

        Arrays.sort(fruits);

        System.out.println("\nAfter sorting");
        System.out.print("\t");
        for(int i=0;i<fruits.length;++i)
        {
            System.out.print(fruits[i]+" ");
        }
         
    }
}