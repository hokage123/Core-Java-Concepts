//File Reciever
import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.net.*;
class Anki427
{
Socket s;
ServerSocket ss;
DataInputStream dis,dis1;
PrintWriter pw;
public Anki427()
{
try
{
ss=new ServerSocket(10);
s=ss.accept();
dis=new DataInputStream(s.getInputStream());
String s2=dis.readUTF();
FileWriter fo=new FileWriter(s2);
pw=new PrintWriter(fo);
FileReceiver();
}
catch(Exception e)
{
System.out.println(e);
}
}
public void FileReceiver()
{
String str="";
try
{
do
{
str=dis.readUTF();
pw.println(str);
pw.flush();
}
while(!str.equals(null));
}
catch(Exception e)
{
System.out.println(e);
}
}
public static void main(String... d)
{
new Anki427();
}
}