//MyReverseIter
import java.util.Iterator;
import java.util.LinkedList;
class Anki565
{
public static void main(String... s)
{
LinkedList<String> arrl=new LinkedList<>();
arrl.add("First");
arrl.add("Second");
arrl.add("Third");
arrl.add("Random");
Iterator<String> itr=arrl.descendingIterator();//descendingIterator() se jo obj milta hai woh LinkedList ulte order me access
while(itr.hasNext())
System.out.println(itr.next());
}
}