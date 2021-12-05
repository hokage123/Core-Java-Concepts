//CopyCollection
import java.util.ArrayList;
import java.util.Collections;
import java.util.Vector;
class Anki616
{
public static void main(String... s)
{
ArrayList<String> arrayList=new ArrayList<>();
arrayList.add("1");
arrayList.add("2");
arrayList.add("3");
arrayList.add("4");
arrayList.add("5");
Vector<String> v=new Vector<>();
v.add("A");
v.add("B");
v.add("C");
v.add("D");
v.add("E");
v.add("F");
v.add("G");
v.add("H");
System.out.println(v);
Collections.copy(v,arrayList);
System.out.println(v);
}
}