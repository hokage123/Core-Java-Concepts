import java.io.*;
class Anki378
{
public static void main(String[] di)throws IOException
{
DataInputStream din=new DataInputStream(new FileInputStream("ducat4.txt"));
String s="";
while(s!=null)
{
s=din.readLine();
if(s!=null)
System.out.println(s);
}
din.close();
}
}