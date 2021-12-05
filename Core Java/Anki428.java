//My serialized Client
import java.io.*;
import java.net.*;
class Anki428
{
Socket s;
ObjectOutputStream dout;
public Anki428()
{
try
{
s=new Socket("Localhost",8);
//s=new Socket("192.165.188.8",8);
emp1 e1=new emp1(10,"aaa");
dout=new ObjectOutputStream(s.getOutputStream());
dout.writeObject(e1);
dout.flush();
}
catch(Exception e)
{
System.out.println(e);
}
}
public static void main(String n[])
{
new Anki428();
}
}