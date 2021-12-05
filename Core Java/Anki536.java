//MyListIterator
//via Iterator we can move in forward direction via ListIterator we can move in forward direction as well as in backward drection 
import java.util.*;
import java.util.List;
import java.util.ListIterator;
class Anki536
{
public static void main(String... s)
{
List<Integer> li=new ArrayList<>();
ListIterator<Integer> litr=null;
li.add(23);
li.add(98);
li.add(29);
li.add(71);
li.add(5);
litr=li.listIterator();
System.out.println("Elements in forward direction");
while(litr.hasNext())
System.out.println(litr.next());
System.out.println("Elements in backward direction");
while(litr.hasPrevious())
System.out.println(litr.previous());
}
}