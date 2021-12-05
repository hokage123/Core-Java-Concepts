import java.io.*;
import java.util.*;
class Anki380
{
public static void main(String... s)throws IOException
{
//SequenceInputStream sin=new SequenceInputStream(new FileInputStream("chachi.txt"),new FileInputStream("chacha.txt"));
SequenceInputStream sin=new SequenceInputStream(new MyEnum());
DataInputStream din=new DataInputStream(sin);
String S="";
while(S!=null)
{
S=din.readLine();
if(S!=null)
System.out.println(S);
}
din.close();
}
}
class MyEnum implements Enumeration
{
InputStream in[];
int i=-1;
MyEnum()
{
try
{
in=new InputStream[]{new FileInputStream("chachi.txt"),new FileInputStream("chacha.txt"),new FileInputStream("lalu.txt")};
}
catch(Exception e)
{}
}
public boolean hasMoreElements()
{
System.out.println("hasMoreElement");
if(++i<in.length)
return true;
else 
return false;
}
public Object nextElement()
{
System.out.println("nextElement"+i);
return in[i];
}

}