//My Server1
import java.io.*;
import java.net.*;
class Anki419
{
ServerSocket ss;
Socket s;
DataInputStream dis;
DataOutputStream dos;
public Anki419()
{
try
{
System.out.println("Server connected");
ss=new ServerSocket(7);
s=ss.accept();
System.out.println(s);
System.out.println("client connected");
dis=new DataInputStream(s.getInputStream());
dos=new DataOutputStream(s.getOutputStream());
serverChat();
}
catch(Exception e)
{
System.out.println(e);
}
}
public static void main(String... s)
{
new Anki419();
}
public void serverChat()throws IOException
{
String str,s1;
do
{
str=dis.readUTF();
System.out.println("Client Message"+str);
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
s1=br.readLine();
dos.writeUTF(s1);
dos.flush();
}
while(!s1.equals("stop"));
}
}