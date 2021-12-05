//get the superclasses
import java.lang.reflect.*;
import java.awt.*;
class Anki433
{
public static void printSuperclasses(Object o)
{
Class subClass=o.getClass();
Class superClass=subClass.getSuperclass();
while(superClass!=null)//superClass null tab ayega jab Object subclass hoga
{
System.out.println(superClass.getName());
subClass=superClass;
superClass=subClass.getSuperclass();
}
}
public static void main(String... c)
{
Frame f=new Frame("aa");
printSuperclasses(f);
}
}