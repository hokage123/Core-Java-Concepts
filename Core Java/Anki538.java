//SynchronizedArray
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Collections;
class Anki538
{
public static void main(String... s)
{
List<String> syncal=Collections.synchronizedList(new ArrayList<String>());//Annonymous obj is passed in synchronizedList() of a collection to synchronize a list so there be no upper non-synchronous acess
//adding elements to synchronized ArrayList
syncal.add("Pen");
syncal.add("Notebook");
syncal.add("Ink");
System.out.println("Iterating Synchronized List");
synchronized(syncal)
{
Iterator<String> iterator=syncal.iterator();
while(iterator.hasNext())
System.out.println(iterator.next());
}
}
}