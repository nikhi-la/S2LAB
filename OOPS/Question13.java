import java.util.Scanner;

class LoginFailedException extends Exception
{
    LoginFailedException(String s)
    {
        super(s);
    }
}
class Question13
{

    static void validate(String u,String p) throws LoginFailedException
    {
        String username="nikhila";
        String password="123456";
        
        if(username.equals(u) && password.equals(p))
        {
            
            System.out.println("Login Successful");
        }
        else
        {
            throw new LoginFailedException("Login Failed");
        }
    }

    public static void main(String args[])
    {
        try
        {
            Scanner s=new Scanner(System.in);
            
            System.out.println("Enter Username");
            String uname=s.nextLine();
            System.out.println("Enter Password");
            String pword=s.nextLine();

            validate(uname,pword);

        }catch(LoginFailedException e)
        {
            System.out.println(e);
        }
    }
}