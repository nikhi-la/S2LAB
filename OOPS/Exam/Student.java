import java.util.Scanner;
class StudentDetails{
    int rollno,m1,m2,m3,totalmarks;
    String name;

    void getDetails(Scanner s){
    
        System.out.println("Enter roll number");
        rollno=s.nextInt();s.nextLine();
        System.out.println("Enter name");
        name=s.nextLine();
        System.out.println("Enter mark 1");
        m1=s.nextInt();
        System.out.println("Enter mark 2 ");
        m2=s.nextInt();
        System.out.println("Enter mark 3");
        m3=s.nextInt();

        totalmarks=m1+m2+m3;
    }

    void display(){
        System.out.println("Roll Number : "+rollno);
        System.out.println("Name        : "+name);
        System.out.println("Mark 1      : "+m1);
        System.out.println("Mark 2      : "+m2);
        System.out.println("Mark 3      : "+m3);
        System.out.println("Total Marks : "+totalmarks);
    }
}
class  Student{
    public static void main(String args[]){

        int index=0;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter count of students");
        int n=sc.nextInt();

        StudentDetails s[]=new StudentDetails[n];

        for(int i=0;i<n;++i){
            System.out.println("Enter details of Student "+(i+1));
            s[i]=new StudentDetails();
            s[i].getDetails(sc);
        }

        System.out.println("\n*********Highest Score**********\n");
        int highest=0,i;
        for(i=0;i<n;++i){
            if(s[i].totalmarks>highest){
                highest=s[i].totalmarks;
                index=i;
                break;
            }
        }
        s[i].display();
    }
}