//Map
//HashMapDemo
import java.util.*;
class Anki568
{
public static void main(String... o)
{
HashMap<String,String> hm=new HashMap<>();
System.out.println(hm.size());
hm.put("1001","aaaa");//yahan add() ke jagah put() method key val ka pair entry class ke obj ke form me add
hm.put("1002","bbbb");
hm.put("1003","cccc");
hm.put("1004","dddd");
hm.put(new String("1001"),"zzz");//map me key unique val same ho skti hai agar phir usi key par put chalaya toh val replace
Set s=hm.entrySet();//entrySet() se Entry class ke obj set ke form me 
Iterator<Map.Entry> i=s.iterator();
while(i.hasNext())
{
Map.Entry e=i.next();//next() chalaya entry nikali
String k=(String)e.getKey();//getKey() se  entry se key nikali
String v=(String)e.getValue();//getValue() se  entry se value nikali
System.out.println(k+"= "+v);
}
}
}