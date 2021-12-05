//udp Client
import java.net.*;
import java.io.*;
class Anki422
{
public static void main(String a[])throws Exception
{
DatagramSocket ds=new DatagramSocket();
String s="  india is good country  ";
byte b[]=s.getBytes();
InetAddress i=InetAddress.getLocalHost();
DatagramPacket dp=new DatagramPacket(b,b.length,i,8);//arg me array ka ref array me se kitne ele pass vo ipAddress InetAddress ke form me String ke form me pass nahi kr sakte port no bhi pass
ds.send(dp);
}
}