import java.io.*;
class Anki367
{
public static void main(String... s)throws IOException
{
FileInputStream fr=new FileInputStream("lalu.txt");
byte b[]=new byte[fr.available()];
fr.read(b);
String S=new String(b);
System.out.println(S);
}
}