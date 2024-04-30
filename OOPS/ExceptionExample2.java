class NegativeException extends Exception
{
    NegativeException(String s)
    {
        super(s);
    }
}

class ExceptionExample2
{
    public static void main(String args[])
    {
        try
        {
            int[] a={1,2,3,4};
            int c=5-7;
            if (c<0)
                throw new NegativeException("Negative Value");
            
        }catch(NegativeException n)
        {
            System.out.println(n);
        }
        System.out.println("Continue..");
    }
}