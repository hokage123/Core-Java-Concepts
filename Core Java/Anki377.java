import java.io.*;
class Anki377
{
public static void main(String[] ts)throws IOException
{
DataInputStream din=new DataInputStream(System.in);
FileOutputStream fout=new FileOutputStream("ab.txt");
PrintStream dout=new PrintStream(fout);
String s="";
while(!s.equals("naruto"))
{
s=din.readLine();
dout.println(s);
}
din.close();
dout.close();
}
}