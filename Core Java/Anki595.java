//IdentityHashMapEx
//IdentityHashMap and HashMap me difference kya jab dono unsynchronized and failfast
//1 IdentityHashMap == use key val ka pair compare krne ke liye yahan refid hamesha return jabki HashMap  Object ka equals() use
//2 IdentityHashMap System  class ka method identityHashCode() se hascode nikaalta hai jabki HashMap Object class ka hashCode() use
//3 IdentityHashMap == ke karan faster HashMap equals() ke karan slow
import java.util.IdentityHashMap;
import java.util.HashMap;
class Anki595
{
public static void main(String... s)
{
IdentityHashMap<String,String> identityMap=new IdentityHashMap<>();
HashMap<String,String> map1=new HashMap<>();
identityMap.put("sony","bravia");
identityMap.put(new String("sony"),"mobile");
map1.put("sony","bravia");
map1.put(new String("sony"),"mobile");
//size of identityMap should be 2 here because two String are different objects
System.out.println("size of IdentityHashMap"+identityMap.size());
System.out.println("size of HashMap"+map1.size());
System.out.println("IdentityHashMap:"+identityMap);
System.out.println("HashMap:"+map1);
identityMap.put("sony","videogame");
map1.put("sony","videogame");
//size of identityMap still should be 2 because "sony" and "sony" is same objects
System.out.println("size of IdentityHashMap"+identityMap.size());
System.out.println("size of HashMap"+map1.size());
System.out.println("IdentityHashMap:"+identityMap);
System.out.println("HashMap:"+map1);
}
}