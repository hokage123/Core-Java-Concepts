//TreeSet andar se TreeMap ka obj banaya yeh bhi NavigableSet ko implement jo NavigableMap ke tarah NavigableSet SortedSet ko extend jaise NavigableMap SortedMap ko extend krta tha 
//TreeSetDemo2
import java.util.*;
class Anki605
{
public static void main(String... s)
{
TreeSet<String> al=new TreeSet<>();
System.out.println(al.size());
al.add("ccc");
al.add("bbbbbbbb");
al.add("aaaaa");
al.add("ddddd");
Iterator i=al.iterator();
while(i.hasNext())
{
String e=(String)i.next();
System.out.println(e);
}
}
}