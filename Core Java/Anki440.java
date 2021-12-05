//kisi class ke saare method print
import java.lang.reflect.*;
import java.awt.*;
class Anki440
{
public static void printMethods(Object o)
{
Class c=o.getClass();
Method m[]=c.getMethods();
for(int i=0;i<m.length;i++)
{
System.out.print(m[i].getReturnType().getName());//returntype ke datatype Class ke obj ke form me getName() se naam print
System.out.print(""+m[i].getName());//Method Class ke obj method ko represent getName() se naam print
System.out.print("(");
Class type[]=m[i].getParameterTypes();//args Class ke ref type array me store 
for(int k=0;k<type.length;k++)
System.out.print(type[k].getName()+",");
System.out.print(")");
System.out.println("");
}
}
public static void main(String... u)
{
String t=new String("ss");
printMethods(t);
}
}