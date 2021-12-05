//my Client1
import java.io.*;
import java.net.*;
class Anki418
{
Socket s;
DataInputStream dis;
DataOutputStream dos;
public Anki418()
{
try
{
//s=new Socket("",3);
s=new Socket("Localhost",7);
System.out.println(s);
dis=new DataInputStream(s.getInputStream());
dos=new DataOutputStream(s.getOutputStream());
clientChat();
}
catch(Exception e)
{
System.out.println(e);
}
}
public void clientChat()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String s1;
do
{
s1=br.readLine();
dos.writeUTF(s1);
dos.flush();
System.out.println("server message"+dis.readUTF());
}
while(!s1.equals("stop"));
}
public static void main(String... a)
{
new Anki418();
}
}