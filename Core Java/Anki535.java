//MyItrRemoveElement
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
class Anki535
{
public static void main(String... s)
{
String removeElem="perl";
List<String> myList=new ArrayList<String>();
myList.add("java");
myList.add("unix");
myList.add("oracle");
myList.add("c++");
myList.add("perl");
myList.add("perl");
myList.add("perl");
System.out.println("before remove");
System.out.println(myList);
Iterator<String> itr=myList.iterator();
while(itr.hasNext())
{
if(removeElem.equals(itr.next()))
itr.remove();
}
System.out.println("after remove");
System.out.println(myList);
}
}