import java.lang.reflect.*;//reflection ki saari classes iske andar
import java.awt.*;
class Anki432
{
	//clue2 used if we have obj of any class 
public static void printName(Object o)
{
Class c=o.getClass();
System.out.println(c.getName());
}
//clue1 if we have name of any class in form of String with name of complete package 
public static void printName(String s)
{
try
{
Class c=Class.forName(s);
System.out.println(c.getName());
StringBuffer sb=(StringBuffer)c.newInstance();
System.out.println(sb.length());
System.out.println(sb.capacity());
}
catch(Exception e)
{}
}
//clue1 if we have name of any class in form of String with name of complete package
public static void printName1(String s)
{
try
{
Class c=Class.forName(s);
System.out.println(c.getName());
Temp sb=(Temp)c.newInstance();
sb.show();
}
catch(Exception e)
{
System.out.println(e);
}
}
public static void main(String[] g)
{
Button b=new Button("hh");
printName(b);
printName("java.lang.StringBuffer");
//printName("java.awt.Frame");//ClassCastException Frame cannot be downcasted to StringBuffer 
printName1("Temp");
//clue3 if we have name of any class at compiletime
Class c=java.lang.Thread.class;
System.out.println(c.getName());
}
}
class Temp
{
Temp()
{
System.out.println("Default Constructor");
}
void show()
{
System.out.println("creation of obj via reflection");
}
}