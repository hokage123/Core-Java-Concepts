//LinkedHashMapDemo2
//LinkedHashMap insertion and last access order dono maintain iska ek constructor LinkedHashMap(int capacity,float loadfactor,boolean lastaccess) agar yeh use nahi yaa iske last var me true pass nahi toh last acess ko yaad nahi
import java.util.*;
class Anki579
{
public static void main(String... j)
{
LinkedHashMap<Emp,String> hm=new LinkedHashMap<>();
System.out.println(hm.size());
hm.put(new Emp(10),"aaaa");
hm.put(new Emp(20),"bbbb");
hm.put(new Emp(30),"cccc");
hm.put(new Emp(40),"dddd");
Set s=hm.entrySet();
Iterator i=s.iterator();
while(i.hasNext())
{
Map.Entry e=(Map.Entry)i.next();
Emp k=(Emp)e.getKey();
String v=(String)e.getValue();
System.out.println(k.id+"="+v);
}
System.out.println("Is Map Empty?"+hm.isEmpty());
Emp e=new Emp(40);
String ss=hm.get(e);
System.out.println(ss);
System.out.println("contains Key"+hm.containsKey(e));
System.out.println("contains Value"+hm.containsValue("bbbb"));
hm.remove(e);
 s=hm.entrySet();
 i=s.iterator();
while(i.hasNext())
{
Map.Entry e1=(Map.Entry)i.next();
Emp k=(Emp)e1.getKey();
String v=(String)e1.getValue();
System.out.println(k.id+"="+v);
}
}
}
class Emp
{
int id;
Emp(int id)
{
this.id=id;
}
public boolean equals(Object o)
{
Emp e=(Emp)o;
System.out.println("equals");
if(e.id==this.id)
return true;
else
return false;
}
public int hashCode()
{
System.out.println("hashCode");
return id*10;
}
}