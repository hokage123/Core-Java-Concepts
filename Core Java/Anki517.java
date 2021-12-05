//Collection
//ArrayListDemo
import java.util.*;
class Anki517
{
public static void main(String... f)
{
ArrayList<String> al=new ArrayList<String>();
//ArrayList al=new ArrayList();//pehle aise ab generic type aa gaya Heterogenous ab support nahi
System.out.println(al.size());//andar kitne num of element wo print
al.add("d");
al.add("b");
al.add("a");
al.add("b");
//al.add(new Integer(10));//pehle box krke dalna pdta tha ab dalega hi nahi generic type String
System.out.println(al.size());
al.remove(2);//remove() overloaded es index par ke element ko remove
System.out.println(al.size());
System.out.println(al);//al ko print krne par andar ke objs print ArrayList ne toString() ko override kr rakha hai
}
}