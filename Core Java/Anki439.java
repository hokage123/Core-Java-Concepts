//kisi class ke saare constructor print
import java.lang.reflect.*;
import java.awt.*;
class Anki439
{
public static void printConstructor(Object o)
{
Class c=o.getClass();
Constructor cs[]=c.getConstructors();
for(int i=0;i<cs.length;i++)
{
System.out.print(c.getName()+"(");//constructor kaa naam vahi jo class kaa naam
Class type[]=cs[i].getParameterTypes();//parameter ke datatype array me store
for(int k=0;k<type.length;k++)
System.out.print(type[k].getName()+",");//saare args print uske liye loop
System.out.print(")");
System.out.println("");
}
}
public static void main(String... s)
{
Thread t=new Thread("ss");
//String s1=new String("hh");//String yaa Thread kisi class ke saare Constructor print
printConstructor(t);
}
}