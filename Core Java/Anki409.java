import java.io.*;
class Anki409
{
public static void main(String S[])throws IOException
{
File f=new File(S[0]);
boolean b=f.exists();
if(b==true)
{
System.out.println("exist");
String path=f.getPath();
String name=f.getName();
long l=f.length();
System.out.println("path="+path);
System.out.println("name="+name);
System.out.println("size"+l);
boolean b1=f.isFile();
if(b1==true)
{
System.out.println("it is a file");
f.delete();
}
boolean b2=f.isDirectory();
if(b2==true)
{
System.out.println("It is a folder");
String list[]=f.list();
for(int i=0;i<list.length;i++)
System.out.println(list[i]);
}
}
else
{
System.out.println("folder doesn't exist");
f.mkdir();
}
}
}