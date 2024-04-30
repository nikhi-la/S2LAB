class ExceptionExample1
{
    public static void main(String args[])
    {
        try
        {
            int[] a={1,2,3,4};
            int c=5-6;
            if (c<0)
                throw new ArithmeticException();
            
        }catch(ArithmeticException e)
        {
            System.out.println("Negative Value");
        }
        System.out.println("Continue..");
    }
}