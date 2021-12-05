//MyLastElement
import java.util.LinkedList;
class Anki563
{
public static void main(String... s)
{
LinkedList<String> arrl=new LinkedList<>();
/*arrl.add("first");
arrl.add("second");
arrl.add("third");
arrl.add("random");*/
//System.out.println("Last Element:"+arrl.getLast());//Agar list empty hai toh getLast() NoSuchElementException pekega par peekLast() nahi
System.out.println("Last Element:"+arrl.peekLast());
System.out.println("Last Element:"+arrl);
}
}
//getLast() returns the last element in the list but if the list is empty it returns exception
//peekLast() retrieves the last element in the list but if the list is empty it returns null