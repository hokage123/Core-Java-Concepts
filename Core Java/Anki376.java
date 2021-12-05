import java.io.*;
class Anki376
{
public static void main(String[] ts)throws IOException
{
DataInputStream din=new DataInputStream(System.in);
FileOutputStream fout=new FileOutputStream("ducat4.txt");
DataOutputStream dout=new DataOutputStream(fout);
String s="";
while(!s.equals("naruto"))
{
s=din.readLine();
System.out.println(s);
dout.writeBytes(s);//dout.writeChars(s)//dout.writeUTF(s)
dout.flush();
}
din.close();
dout.close();
}
}