//HashMapSyncExample
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
class Anki573
{
public static void main(String... s)
{
Map map=Collections.synchronizedMap(new HashMap<Integer,String>());//Collections ke synchronizedMap() se map jise pass synchronized
map.put(2,"Anil");
map.put(44,"Ajit");
map.put(4,"Sachin");
map.put(88,"xyz");
Set set=map.entrySet();
synchronized(map)
{
Iterator i=set.iterator();
//Display elements
while(i.hasNext())
{
Map.Entry me=(Map.Entry)i.next();
System.out.println(me.getKey()+":"+me.getValue());
}
}
}
}