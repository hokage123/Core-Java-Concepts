//WeakHashMapExample
//WeakHashMap ka obj garbage collection ke liye pehle se eligible weak reference bahar se delete andar se  automatically delete jabki HashMap me agar ref bahar se delete toh andar se delete nahi
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
class Anki596
{
public static void main(String... s)
{
Map hashMap=new HashMap();
Map weakHashMap=new WeakHashMap();
Temporary t1=new Temporary();
Temporary t2=new Temporary();
hashMap.put(t1,"sai");
System.out.println("before Hashmap gets garbage collected");
System.out.println(hashMap);
t1=null;
System.gc();
System.out.println("After HashMap gets garbage collected");
System.out.println(hashMap);
weakHashMap.put(t2,"sai");
System.out.println("before WeakHashmap gets garbage collected");
System.out.println(weakHashMap);
t2=null;
System.gc();
System.out.println("After WeakHashMap gets garbage collected");
System.out.println(weakHashMap);
}
}
class Temporary
{
public String toString()
{
return "Temporary";
}
public void finalize()
{
System.out.println("Finalize method called");
}
}