//ArrayListDemo3
import java.util.*;
class Anki520
{
public static void main(String... s)
{
ArrayList<ArrayList> al=new ArrayList<ArrayList>();
ArrayList<String> als=new ArrayList<String>();
System.out.println(al.size());
als.add("a");
als.add("b");
als.add("c");
al.add(als);
al.add(al);
System.out.println(al.size());
System.out.println(al);
}
}
//al ek ArrayList jisme ArrayList ke obj add kya al.add(al) kr skte hai khud ko add kr skte hai?
//haan  khud ko bhi add kr skta khud ke andar ke obj ko nahi yahan al kaa size 2 ek khud ek als 