import java.util.Scanner;

class Student{
    String name;
    int roll_no;
    int[] marks=new int[5];
    String[] sub={"Maths    ","English  ","Physics  ","Chemistry","Computer "};
}
interface Sports{
    int sportsmark=8;
}
class Result extends Student implements Sports{

    int totalmarks=0;
    void totalmark()
    {
        for (int i=0;i<5;++i)
        {
            totalmarks=totalmarks+marks[i];
        }
        totalmarks=totalmarks+sportsmark;
    }

    void display()
    {
        totalmark();
        System.out.println("\n********Score Card********\n");
        System.out.println("Name         : "+name);
        System.out.println("Roll No.     : "+roll_no);
        System.out.println("\n-------Mark List-------\n");
        for (int i=0;i<5;++i)
        {
            System.out.println(sub[i]+ "    : "+marks[i]);
        }
        System.out.println("Sports Mark  : "+sportsmark);
        System.out.println("\nTotal Marks  : "+totalmarks);
    }

}

class Question10_2
{
    public static void main(String args[])
    {
        Result r=new Result();

        Scanner s=new Scanner(System.in);
        
        System.out.println("Enter Name");
        r.name=s.nextLine();
        System.out.println("Enter Roll No.");
        r.roll_no=s.nextInt();
        System.out.println("Enter Marks of 5 subject");
        
        for (int i=0;i<5;++i)
        {
            System.out.println(r.sub[i]);
            r.marks[i]=s.nextInt();
        }
        r.display();
    }
}