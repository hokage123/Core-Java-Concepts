//DescendingMap
//NavigableMap kaa method descendingMap() jisse pura map ulta order me aayega
import java.util.NavigableMap;
import java.util.TreeMap;
import java.util.Map.Entry;
class Anki586
{
public static void main(String... s)
{
NavigableMap<Integer,String> map=new TreeMap<>();
map.put(2,"two");
map.put(1,"one");
map.put(3,"three");
System.out.println("original Map:"+map+"\n");
NavigableMap reverse=map.descendingMap();
System.out.println("Descending Map"+reverse+"\n");
}
} 