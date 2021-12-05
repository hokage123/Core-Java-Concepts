//class ke saare var datatype aur naam ke saath print public hona zaroori hai nahi toh ignore
import java.lang.reflect.*;
import java.awt.*;
class Anki438
{
public static void printFields(Object o)
{
Class c=o.getClass();
Field f[]=c.getFields();//iise saare datatype array me aa payenge
for(int i=0;i<f.length;i++)
{
System.out.println("");
Class type=f[i].getType();//uske saare datatype class ke obj se represent
System.out.println(type.getName());//datatype ke naam print
System.out.println(""+f[i].getName());//var ke naam print
}
}
public static void main(String... s)
{
Temp c=new Temp();
Color d=new Color(1,1,1);
printFields(c);
printFields(d);
}
}
class Temp
{
public int x;
public byte b;
public long l;
public short s;
double d;
char ch;
public float f;
}