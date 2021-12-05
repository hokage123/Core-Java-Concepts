//ArrayList se Enumeration nikaal skta hai Collections class ka enumeration() method failfast waali arrayList ka withdraw remove
//ArrayListEnumeration
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
class Anki613
{
public static void main(String... s)
{
ArrayList<String> arrayList=new ArrayList<>();
arrayList.add("A");
arrayList.add("B");
arrayList.add("C");
arrayList.add("D");
arrayList.add("E");
Enumeration e=Collections.enumeration(arrayList);
while(e.hasMoreElements())
System.out.println(e.nextElement());
}
}