import java.io.*;

class FileExRead
{
    public static void main(String args[]) throws IOException
    {
        String s;
        FileReader f=new FileReader("D:/Nikhila/OOPS/File/input.txt");
        BufferedReader  br = new BufferedReader(f);

        while((s=br.readLine())!=null)
        {
            System.out.println(s);
        }
        br.close();
    }
}