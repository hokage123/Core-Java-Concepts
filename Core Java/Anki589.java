//NavigableMapDemo1
import java.util.NavigableMap;
import java.util.TreeMap;
import java.util.Map.Entry;
class Anki589
{
public static void main(String... f) 
{
NavigableMap<Integer,String> map=new TreeMap<>();
map.put(2,"two");
map.put(1,"one");
map.put(3,"three");
System.out.println("original Map:"+map+"\n");
System.out.println("FirstKey"+map.firstKey());//firstKey() NavigableMap ka method jo sorted order ke hisaab se first key nikaal kr dega par wo entry remove nhi karega
System.out.println("original Map:"+map+"\n");
System.out.println("LastKey"+map.lastKey());////lastKey() NavigableMap ka method jo sorted order ke hisaab se last key nikaal kr dega par wo entry remove nhi karega
System.out.println("original Map:"+map+"\n");
}
}