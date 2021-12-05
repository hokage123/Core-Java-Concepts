//NavigableMapCeilingKey1
import java.util.NavigableMap;
import java.util.TreeMap;
class Anki584
{
public static void main(String... o)
{
NavigableMap<String,String> navigableMap=new TreeMap<>();
navigableMap.put("c++","goodprogramminglanguage");
navigableMap.put("java","Bestprogramminglanguage");
navigableMap.put("scala","AnotherJVMlanguage");
navigableMap.put("phython","language which google use");
System.out.println("sorted Map"+navigableMap);
//ceiling returns key which is greater than or equal to specified key
System.out.println("ceiling Key from Java"+navigableMap.ceilingKey("java"));//NavigableMap ke method ceilingKey() agar  arg me pass key mila to vahi nahi toh bada Wala 
System.out.println("floor Key from Java"+navigableMap.floorKey("java"));//NavigableMap ke method floorKey() agar  arg me pass key mila to vahi nahi toh chota Wala 
}
}