import java.util.Scanner;
import java.io.*;
class evenodd{
    public static void main(String args[]) throws IOException{
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the limit");
        int n=s.nextInt();

        FileWriter fe=new FileWriter("even.txt");
        BufferedWriter bwe=new BufferedWriter(fe);

        FileWriter fo=new FileWriter("odd.txt");
        BufferedWriter bwo=new BufferedWriter(fo);

        for(int i=1;i<=n;++i){
            if(i%2==0){
                bwe.write(String.valueOf(i));
                bwe.write("\n");
            }
            else{
                bwo.write(String.valueOf(i));
                bwo.write("\n");
            }
        }
        bwe.close();
        bwo.close();
    }
}