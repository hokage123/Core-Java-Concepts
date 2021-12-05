//hamara class kis package me hain wo print
import java.lang.reflect.*;
import java.awt.*;
class Anki441
{
static void printPackage(Object o)
{
Class c=o.getClass();
Package pk=c.getPackage();//package ke naam ka obj return jo Package ke ref me store
System.out.println(pk.getName());
}
public static void main(String... j)
{
String t=new String("s");
printPackage(t);
}
}