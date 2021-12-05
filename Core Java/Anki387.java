import java.io.*;
class Anki387
{
public static void main(String ou[])throws IOException
{
PrintWriter pw=new PrintWriter(new FileWriter("abc1.txt"));
pw.println("hello");
pw.println("hey");
pw.close();
System.out.println("file created");
}
}