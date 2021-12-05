//MyListFrequency
//Collections ki frequency() me list pass aur obj pass par jis class ka obj pass use equals() ko override krna padega aur ArrayList me jis class ka obj pass use bhi equals() ko override krna padega  
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class Anki625
{
public static void main(String... s)
{
List<String> ll=new ArrayList<>();
ll.add("one");
ll.add("two");
ll.add("three");
ll.add("four");
ll.add("two");
ll.add("three");
ll.add("two");
ll.add("one");
System.out.println("Actual List"+ll);
System.out.println("Frequency of one:"+Collections.frequency(ll,"one"));
System.out.println("Frequency of one:"+Collections.frequency(ll,"two"));
System.out.println("Frequency of one:"+Collections.frequency(ll,"three"));
}
}