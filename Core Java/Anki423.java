//udp server
import java.net.*;
import java.io.*;
class Anki423
{
public static void main(String []p)throws Exception
{
DatagramSocket ds=new DatagramSocket(8);
byte b[]=new byte[1024];
DatagramPacket dp=new DatagramPacket(b,b.length);
ds.receive(dp);//no connecton is made DatagramSocket ne DatagramPacket ko only receive kiya
String r=new String(dp.getData());
System.out.println(r.trim());
}
}