import java.io.*;
class Anki373
{
public static void main(String ang[])throws IOException
{
FileOutputStream fout=new FileOutputStream("abc.txt");
PrintStream ps=new PrintStream(fout);
System.out.println("Hello");
System.setOut(ps);
System.out.println("fuckall");
FileOutputStream fout1=new FileOutputStream("abc1.txt");
PrintStream ps1=new PrintStream(fout1);
System.err.println("kiss Akeno");
System.setErr(ps1);
System.err.println("kiss Rias");
}
}