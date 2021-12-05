//get our class modifier either it is final or abstract or public or public abstract or public final or final abstract  
import java.lang.reflect.*;
import java.awt.*;
class Anki435
{
public static void printModifier(Object o)throws Exception
{
//Class c=o.getClass();
Class c=Class.forName("java.awt.Graphics");
int m=c.getModifiers();//how a const can point to two modifier it will be sum of two consts
if(Modifier.isPublic(m))
System.out.println("public");
if(Modifier.isFinal(m))
System.out.println("final");
if(Modifier.isAbstract(m))
System.out.println("abstract");
}
public static void main(String[] n)throws Exception
{
String a=new String("aaa");
printModifier(a);
}
}//a class can't be final public and abstract at the same time