//LinkedHashMapDemo
//LinkedHashMap insertion and last access order dono maintain iska ek constructor LinkedHashMap(int capacity,float loadfactor,boolean lastaccess) agar yeh use nahi yaa iske last var me true pass nahi toh last acess ko yaad nahi
import java.util.*;
class Anki580
{
public static void main(String... j)
{
LinkedHashMap<String,String> hm=new LinkedHashMap<>(10,0.75f,true);
//LinkedHashMap<String,String> hm=new LinkedHashMap<String,String>(10,0.75f);
System.out.println(hm.size());
hm.put("1003","aaaa");
hm.put("1002","bbbb");
hm.put("1001","cccc");
hm.put("1004","dddd");
Set s=hm.entrySet();
Iterator i=s.iterator();
while(i.hasNext())
{
Map.Entry e=(Map.Entry)i.next();
String k=(String)e.getKey();
String v=(String)e.getValue();
System.out.println(k+"="+v);
}
String s1[]={"1001","1002","1003","1004"};
for(int i1=0;i1<s1.length;i1++)
System.out.println(hm.get(s1[i1]));
 s=hm.entrySet();
 i=s.iterator();
System.out.println("");
 while(i.hasNext())
{
Map.Entry e=(Map.Entry)i.next();
String k=(String)e.getKey();
String v=(String)e.getValue();
System.out.println(k+"="+v);
}
}
}