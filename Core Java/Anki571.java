//HashMapClone
import java.util.HashMap;
import java.util.Map;
class Anki571
{
public static void main(String... u)
{
HashMap hashMap=new HashMap();
hashMap.put(1,"one");
hashMap.put(2,"two");
hashMap.put(3,"three");
System.out.println("originalHashMap"+hashMap);
HashMap hashMap1=(HashMap)hashMap.clone();
System.out.println("copiedHashMap"+hashMap1);
}
}
//yahan bhi clonning par yahan par bhi shallow clonning ArrayList LinkList jaisa