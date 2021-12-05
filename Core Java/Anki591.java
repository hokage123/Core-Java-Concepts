//HeadMap
import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;
class Anki591
{
public static void main(String... o)
{
NavigableMap<String,String> navigableMap=new TreeMap<>();
navigableMap.put("c++","goodprogramminglanguage");
navigableMap.put("java","Bestprogramminglanguage");
navigableMap.put("scala","AnotherJVMlanguage");
navigableMap.put("phython","language which google use");
System.out.println("sorted Map"+navigableMap);
//an example of headMap return NavigableMap whose key less than specified
//NavigableMap<String,String> headMap=navigableMap.headMap("phython",true);
SortedMap<String,String> headMap=navigableMap.headMap("phython");
System.out.println("headMap created from navigableMap"+headMap);
}
}