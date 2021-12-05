//MyHashMapCopy
import java.util.HashMap;
class Anki576
{
public static void main(String... o)
{
HashMap<String,String> hm=new HashMap<>();
//add key-val pair to hashmap
hm.put("first","FirstInserted");
hm.put("second","SecondInserted");
hm.put("third","ThirdInserted");
System.out.println(hm);
HashMap<String,String> subMap=new HashMap<>();
subMap.put("s1","s1 Value");
subMap.put("s2","s2 Value");
subMap.put("s3","s3 Value");
hm.putAll(subMap);//putAll() jis map ke obj par chalaya usme saari entries jis map ko passuski put kr di jayege
System.out.println(hm);
}
}