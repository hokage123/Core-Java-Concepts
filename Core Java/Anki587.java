//NavigableMapDemo
import java.util.NavigableMap;
import java.util.TreeMap;
import java.util.Map.Entry;
class Anki587
{
public static void main(String... f) 
{
NavigableMap<Integer,String> map=new TreeMap<>();
map.put(2,"two");
map.put(1,"one");
map.put(3,"three");
System.out.println("original Map:"+map+"\n");
Entry firstEntry=map.pollFirstEntry();//pollFirstEntry() NavigableMap ka method jo sorted order ke hisaab se first entry nikaal kr dega aur remove bhi karega  
System.out.println("First Entry"+firstEntry);
System.out.println("After polling firstEntry"+map+"\n");
Entry lastEntry=map.pollLastEntry();//pollLastEntry() NavigableMap ka method jo sorted order ke hisaab se last entry nikaal kr dega aur remove bhi karega
System.out.println("Last Entry"+lastEntry);
System.out.println("After polling lastEntry"+map+"\n");
}
}