//ConcurrentHashMapE
//jaise ArrayList ke Liye CopyOnWriteArrayList vaise HashMap ke liye ConcurrentHashMap HashMap me iterator ke baad koi change allowed nahi ConcurrentModificationException aa jayega parConcurrentHashMap me iterator ke baad  change allowed hai koi ConcurrentModificationException  nahi  aayega 
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
class Anki594
{
public static void main(String... l)
{
//ConcurrentHashMap
Map<String,String> myMap=new ConcurrentHashMap<>();
myMap.put("1","1");
myMap.put("2","1");
myMap.put("3","1");
myMap.put("4","1");
myMap.put("5","1");
myMap.put("6","1");
System.out.println("concurrent HashMap before iterator"+myMap);
Iterator<String> it=myMap.keySet().iterator();
while(it.hasNext())
{
String key=it.next();
if(key.equals("3"))
myMap.put(key+"new","new3");
}
System.out.println("concurrent HashMap after Iterator"+myMap);
//HashMap
myMap=new HashMap<>();
myMap.put("1","1");
myMap.put("2","1");
myMap.put("3","1");
myMap.put("4","1");
myMap.put("5","1");
myMap.put("6","1");
System.out.println(" HashMap before iterator"+myMap);
it=myMap.keySet().iterator();
while(it.hasNext())
{
String key=it.next();
if(key.equals("3"))
myMap.put(key+"new","new3");
}
System.out.println("HashMap after Iterator"+myMap);
}
}