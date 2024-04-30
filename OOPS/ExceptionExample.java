class ExceptionExample
{
    public static void main(String args[])
    {
        try
        {
            int[] a={1,2,3,4};
            int c=5/0;
            a[6]=10;
        }catch(ArithmeticException e)
        {
            System.out.println("Division by Zero");
        }
        catch(Exception a)
        {
            System.out.println("Array Index");
        }
    }
}