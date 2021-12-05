import java.io.*;
class Anki372
{
public static void main(String... s)throws IOException
{
FileOutputStream fout=new FileOutputStream("abc.txt");
PrintStream ps=new PrintStream(fout);
ps.println("Hello");
ps.println("Hey");
}
}