//the key class must be implementing the Comparable interface otherwise ClassCastException will be thrown 
//TreeMapDemo1
//agar hum key ke tarah apni class ka object use karna chate ho to Comparable interface ko implement compareTo() override krna padega 
import java.util.*;
class Anki582
{
public static void main(String... s)
{
TreeMap<Temp,String> hm=new TreeMap<>();
System.out.println(hm.size());
hm.put(new Temp(10),"dddd");
hm.put(new Temp(5),"cccc");
hm.put(new Temp(1),"bbbb");
hm.put(new Temp(4),"aaaa");
show(hm);
Temp e1=new Temp(10);
//SortedMap sm=hm.headMap(e1);
SortedMap sm=hm.headMap(e1,true);//headMap() me jo pass usse saare chote waale le lega true isliye barabar waala bhi lega
System.out.println("less than 10");
show(sm);
e1=new Temp(1);
sm=hm.tailMap(e1);//tailMap() me jo pass usse saare bade waale le lega  barabar waala bhi lega
System.out.println("greater than 1");
show(sm);
Temp e2=new Temp(10);
//sm=hm.subMap(e1,e2);
sm=hm.subMap(e1,true,e2,true);//subMap() me jo do arg pass unke bich kaa include dono true isliye lowerbound upperbound dono include
System.out.println("between 1 and 10");
show(sm);
System.out.println(hm.isEmpty());
System.out.println(hm.get(e1));
hm.remove(e1);
show(hm);
System.out.println(hm.size());
Map<Temp,String> rm=hm.descendingMap();//descendingMap() se puri map reverse krke nikaalage
show(rm);
}
static void show(Map<Temp,String> hm)
{
Set s=hm.entrySet();
Iterator i=s.iterator();
while(i.hasNext())
{
Map.Entry e=(Map.Entry)i.next();
Temp k=(Temp)e.getKey();
String v=(String)e.getValue();
System.out.println(k.x+"="+v);
}
}
}
class Temp implements Comparable<Temp>
{
int x;
Temp(int x)
{
this.x=x;
}
public int compareTo(Temp t)
{
//System.out.println("compare");
if(this.x>t.x)
return 1;
else if(this.x<t.x)
return -1;
else
return 0;
}
}