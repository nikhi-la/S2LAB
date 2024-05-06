import java.io.*;

class FileExWrite
{
    public static void main(String args[]) throws IOException
    {
        InputStreamReader r=new InputStreamReader(System.in);

        BufferedReader br=new BufferedReader(r);

        System.out.println("Enter string");
        String s=br.readLine();
        FileWriter f=new FileWriter("D:/MACEMCA/SEM2/OOPS/File/write.txt");
        BufferedWriter wr=new BufferedWriter(f);

        wr.write(s);
        wr.append("\nThis is appended string");
        wr.close();
        
        System.out.println("Written Successfully");
    }
}