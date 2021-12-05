//NavigableSetExample
import java.util.*;
import java.util.concurrent.*;
class Anki611
{
public static void main(String... d)
{
NavigableSet<Integer> nSet=new TreeSet<>();
nSet.add(10);
nSet.add(20);
nSet.add(50);
nSet.add(30);
nSet.add(100);
nSet.add(80);
nSet.add(10);
Iterator iterator=nSet.iterator();
System.out.println("Ascending Order navigable Set");
//Ascending Order list
while(iterator.hasNext())
{
System.out.println(iterator.next()+"");
}
System.out.println();
//DescendingOrderList
System.out.println("Descending Order navigable Set:"+nSet.descendingSet()+"\n");
//Greater than or equal to given element
System.out.println("Least element in navigable Set greater than or equal to 35"+nSet.ceiling(35)+"\n");//ceiling() me jo pass barabar toh vahi nahi toh turant bada
//Less than or equal to given element
System.out.println("Greatest element in navigable Set less than or equal to 35"+nSet.floor(35)+"\n");//floor() me jo pass barabar toh vahi nahi toh turant chota
//veiwing the portion of navigableSet whose element are strictly less than given element
System.out.println("NavigableSet whose element are strictly less than 40"+nSet.headSet(40)+"\n");
//veiwing the portion of navigableSet whose element are greater than or equal to given element
System.out.println("NavigableSet whose element are greater than or equal to 40"+nSet.tailSet(40)+"\n");
//Removing first element from NavigableSet
System.out.println("remove element"+nSet.pollFirst());//pollFirst() se first element nikaal kr dega and remove map me entry yahan element 
//After removing the first element now get navigableSet
System.out.println("Now NavigableSet:"+nSet.descendingSet()+"\n");
System.out.println("remove element"+nSet.pollLast());//pollLast() se last element nikaal kr dega and remove map me entry yahan element 
//After removing the last element now get navigableSet
System.out.println("Now NavigableSet:"+nSet.descendingSet()+"\n");
}
}