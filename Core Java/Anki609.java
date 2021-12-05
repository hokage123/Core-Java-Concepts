//NavigableSetDemo
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;
import java.util.Arrays;
class Anki609
{
public static void main(String... s)
{
NavigableSet<String> navigableSet=new TreeSet<String>(Arrays.asList("X","B","A","Z","T"));//Arrays ka asList() me jo pass usse List me convert krke de deta hain
Iterator<String> iterator=navigableSet.descendingIterator();//descendingIterator() se elements ulte order me sorted
System.out.println("original set");
while(iterator.hasNext())
{
System.out.println(iterator.next());
}
System.out.printf("HeadSet :%s %n",navigableSet.headSet("X"));//headSet() subSet() tailSet()  first() last() ussi order me acess karenge chahe iterator() se chahe descendingIterator() se  
System.out.printf("TailSet :%s %n",navigableSet.tailSet("T",false));
System.out.printf("SubSet :%s %n",navigableSet.subSet("B",true,"X",true));
System.out.printf("Last Element : %s %n",navigableSet.last());
System.out.printf("First Element : %s %n",navigableSet.first());
System.out.printf("Reverse Set %s %n",navigableSet.descendingSet());//descendingSet() aisa set dega jo reverse order me sorted
System.out.printf("Set : %s %n",navigableSet);
iterator=navigableSet.iterator();
System.out.println("sorted Navigable Set");
while(iterator.hasNext())
{
System.out.println(iterator.next());
}
System.out.printf("HeadSet :%s %n",navigableSet.headSet("X"));
System.out.printf("TailSet :%s %n",navigableSet.tailSet("T",false));
System.out.printf("SubSet :%s %n",navigableSet.subSet("B",true,"X",true));
System.out.printf("Last Element : %s %n",navigableSet.last());
System.out.printf("First Element : %s %n",navigableSet.first());
System.out.printf("Reverse Set %s %n",navigableSet.descendingSet());//descendingSet() aisa set dega jo reverse order me sorted
System.out.printf("Set : %s %n",navigableSet);
}
}