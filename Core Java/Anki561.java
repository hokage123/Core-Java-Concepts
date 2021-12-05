//LinkedListLoop
import java.util.*;
class Anki561
{
public static void main(String... s)
{
//LinkedListDeclaration
LinkedList<String> linkedlist=new LinkedList<>();
linkedlist.add("Apple");
linkedlist.add("Orange");
linkedlist.add("Mango");
//for loop
System.out.println("***for loop***");
for(int num=0;num<linkedlist.size();num++)
{
System.out.println(linkedlist.get(num));//get() method se bhi LinkedList ke element ek ek krke bahar nikaal skte hai ArrayList ki Tarah
}
//foreach loop
for(String S:linkedlist)//foreach() loop se bhi LinkedList ke element ek ek krke bahar nikaal skte hai ArrayList ki Tarah
System.out.println(S);
//iterator
Iterator i=linkedlist.iterator();//Iterator ke next  se bhi LinkedList ke element ek ek krke bahar nikaal skte hai ArrayList ki Tarah
while(i.hasNext())
System.out.println(i.next());
//using while loop
int num=0;
while(linkedlist.size()>num)//while loop use krke bhi LinkedList ke element ek ek krke bahar nikaal skte hai ArrayList ki Tarah
{
System.out.println(linkedlist.get(num));
num++;
}
}
}