//NavigableMapDemo1
import java.util.NavigableMap;
import java.util.TreeMap;
import java.util.Map.Entry;
class Anki588
{
public static void main(String... f) 
{
NavigableMap<Integer,String> map=new TreeMap<>();
map.put(2,"two");
map.put(1,"one");
map.put(3,"three");
System.out.println("original Map:"+map+"\n");
System.out.println("FirstEntry"+map.firstEntry());//firstEntry() NavigableMap ka method jo sorted order ke hisaab se first entry nikaal kr dega par remove nhi karega
System.out.println("original Map:"+map+"\n");
System.out.println("LastEntry"+map.lastEntry());////lastEntry() NavigableMap ka method jo sorted order ke hisaab se last entry nikaal kr dega par remove nhi karega
System.out.println("original Map:"+map+"\n");
}
}