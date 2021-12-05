//My Serialized Server
import java.io.*;
import java.net.*;
class Anki429
{
ServerSocket ss;
Socket s;
ObjectInputStream dis;
public Anki429()
{
try
{
System.out.println("Server started");
ss=new ServerSocket(8);
s=ss.accept();
System.out.println("Client Connected");
dis=new ObjectInputStream(s.getInputStream());
emp1 z=(emp1)dis.readObject();
z.show();
}
catch(Exception e)
{}
}
public static void main(String b[])
{
new Anki429();
}
}