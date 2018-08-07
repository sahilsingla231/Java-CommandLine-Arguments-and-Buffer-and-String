import java.io.*;
import java.lang.*;

class demo
{
    public static void main(String a[]) throws Exception
    {
       System.out.println("Write");
        InputStreamReader is=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(is);
        String s1=br.readLine();
        System.out.print(s1);
    }
}