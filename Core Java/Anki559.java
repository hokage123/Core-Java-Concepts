//LinkedListExample
import java.util.*;
class Anki559
{
public static void main(String... s)
{
//LinkedListDeclaration
LinkedList<String> linkedlist=new LinkedList<>();
//add(String) element is used for adding the linkedlist
linkedlist.add("Item1");
linkedlist.add("Item2");
linkedlist.add("Item3");
linkedlist.add("Item4");
linkedlist.add("Item5");
linkedlist.add("Item6");
System.out.println("LinkedListContent:"+linkedlist);
//Add First and Last element
linkedlist.addFirst("FirstItem");//addFirst() item  ko head banata hai
linkedlist.addLast("LastItem");//addLast()  item ko tail banata hai
System.out.println("LinkedListContent after addition"+linkedlist);
//This is how to get and set values
Object firstvar=linkedlist.get(0);
System.out.println("first element:"+firstvar);
linkedlist.set(0,"changedFirstItem");
Object firstvar2=linkedlist.get(0);
System.out.println("First element after update by set method:"+firstvar2);
//remove first and last element
linkedlist.removeFirst();//removeFirst() head ko delete and second element ko head banata hai
linkedlist.removeLast();//removeLast() tail ko delete and second Last element ko tail banata hai
System.out.println("LinkedList after deletion of first and Last element");
linkedlist.add(0,"NewlyAddedItem");
linkedlist.remove(2);
System.out.println("Final Content:"+linkedlist);
System.out.println(linkedlist.getFirst());//head nikal kar dega delete nahi karega
System.out.println(linkedlist.getLast());//tail nikal kar dega delete nahi karega
}
}