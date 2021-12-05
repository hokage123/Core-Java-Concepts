//LinkedListExampleEmp
import java.util.*;
class Anki560
{
public static void main(String... s)
{
LinkedList<Emp> linkedlist=new LinkedList<Emp>();
//add String element is used for adding element in linkedlist
linkedlist.add(new Emp(1001,"lalu"));
linkedlist.add(new Emp(1002,"rabari"));
linkedlist.add(new Emp(1003,"Meesa"));
linkedlist.add(new Emp(1004,"lalubeta"));
linkedlist.add(new Emp(1005,"lalupota"));
//display content
Iterator<Emp> i=linkedlist.iterator();
while(i.hasNext())
{
Emp e=i.next();
System.out.println(e.name+""+e.id);
}
//Add First and Last element
linkedlist.addFirst(new Emp(100,"Nitish"));
linkedlist.addLast(new Emp(200,"Mulayam"));
System.out.println("LinkedList content after addition");
i=linkedlist.iterator();
while(i.hasNext())
{
Emp e=i.next();
System.out.println(e.id+""+e.name);
}
Emp firstvar=(Emp)linkedlist.get(0);
System.out.println("FirstElement"+firstvar.id+"  "+firstvar.name);
Emp e2=new Emp(420,"nitish420");
linkedlist.set(0,e2);
firstvar=(Emp)linkedlist.get(0);
System.out.println("First element after update by set methods"+firstvar.id+"  "+firstvar.name);
linkedlist.removeFirst();
linkedlist.removeLast();
System.out.println("after deletion of first & last item"+linkedlist);
i=linkedlist.iterator();
while(i.hasNext())
{
Emp e=i.next();
System.out.println(e.id+""+e.name);
}
e2=new Emp(421,"nitish421");
linkedlist.add(0,e2);
linkedlist.remove(2);
System.out.println("Final Content");
i=linkedlist.iterator();
while(i.hasNext())
{
Emp e=i.next();
System.out.println(e.id+""+e.name);
}
firstvar=linkedlist.getFirst();
System.out.println("FirstElement:"+firstvar.id+"  "+firstvar.name);
firstvar=linkedlist.getLast();
System.out.println("LastElement:"+firstvar.id+"  "+firstvar.name);
}
}
class Emp
{
int id;
String name;
Emp(int id,String name)
{
this.id=id;
this.name=name;
}
}
//LinkedList ke addFirst() addLast() removeFirst() removeLast() getFirst() getLast() sab apne class ke obj par chalakar dekha hai bas
