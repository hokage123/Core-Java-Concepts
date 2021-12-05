//get the interfaces
import java.lang.reflect.*;
import java.io.*;
class Anki434
{
public static void printInterfaces(Object o)
{
Class c=o.getClass();
Class inter[]=c.getInterfaces();
for(int i=0;i<inter.length;i++)
{
System.out.println(inter[i].getName());
if(inter[i].getName().equals("java.io.Serializable"))
System.out.println("my class parent interface is Serializable");
}
}
public static void main(String s[])
{
T t1=new T();
printInterfaces(t1);
}
}
interface a1
{}
interface a2
{}
interface a3
{}
class T implements a1,a2,a3,Serializable
{}