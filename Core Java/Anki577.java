//MyHashMapEntrySet
import java.util.HashMap;
import java.util.Map.Entry;//seede yahan par Map ki inner interface Entry used
import java.util.Set;
class Anki577
{
public static void main(String... o)
{
HashMap<String,String> hm=new HashMap<>();
//add key-val pair to hashmap
hm.put("first","FirstInserted");
hm.put("second","SecondInserted");
hm.put("third","ThirdInserted");
System.out.println(hm);
//getting val for the given key from hashmap
Set<Entry<String,String>> entries=hm.entrySet();//entrySet() se entry kaa collection
for(Entry<String,String> ent:entries)
System.out.println(ent.getKey()+"==>"+ent.getValue());
}
}