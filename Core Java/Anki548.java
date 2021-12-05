//Vector
import java.util.*;
class Anki548
{
public static void main(String... p)
{
Vector<String> al=new Vector<>(3,2);//vector ka fourth constructor Vector(int capacity,int increment) utne hi se har baar increment hone lagega
System.out.println("ini"+al.capacity());//vector me capacity show krta hai
System.out.println(al.size());
al.addElement("a");
al.addElement("b");
al.addElement("c");
al.addElement("d");
System.out.println("cap"+al.capacity());
System.out.println(al.size());
al.removeElementAt(2);//yahan remove() ke saath saath usi ke type ka removeElementAt() bhi use kr skte hai
Enumeration<String> e1=al.elements();//yahan vector me Enumeration se bhi nikal skte hai
while(e1.hasMoreElements())//hasMoreElements() hasNext() jaisa
{
String s=e1.nextElement();//nextElement() next() jaisa
System.out.println(s);
}
System.out.println("");
Iterator<String> e=al.iterator();
while(e.hasNext())
{
String s=e.next();
System.out.println(s);
}
al.trimToSize();
System.out.println("\n cap"+al.capacity());
}
} 