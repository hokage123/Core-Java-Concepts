//SortArrayList
import java.util.*;
class Anki540
{
public static void main(String... s)
{
ArrayList<String> listOfContries=new ArrayList<>();
listOfContries.add("India");
listOfContries.add("Us");
listOfContries.add("China");
listOfContries.add("Denmark");
listOfContries.add("China");
//unSortedList
System.out.println("before Sorting");
for(String counter:listOfContries)
System.out.println(counter);
//sort Statement
Collections.sort(listOfContries);//Collections ka method sort() jo apne aap sort krke vaapas par unhe classes ke obj ko jisne Comparable ko implement and compareTo() ko override agar req condtn satisfy nahi toh ClassCastException
//sorted list
System.out.println("after sorting");
for(String c:listOfContries)
System.out.println(c);
}
}