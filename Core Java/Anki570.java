//HashMapDemo2
import java.util.*;
class Anki570
{
public static void main(String... g)
{
HashMap<Emp,String> hm=new HashMap<>();
System.out.println(hm.size());
System.out.println("Is HashMap empty"+hm.isEmpty());
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
System.out.println(k.id+"= "+v);
}
Emp f=new Emp(40);
String ss=hm.get(f);//get() method me jo key pass us par ki val nikaal kr de deta hai jab equals() true return nahi toh null de deta hai
System.out.println(ss);
hm.remove(f);//remove() me jo key pass uske key val ka pair remove jab equals() true return isiliye equals() override krna pdta 
s=hm.entrySet();
i=s.iterator();
while(i.hasNext())
{
Map.Entry e=(Map.Entry)i.next();
Emp k=(Emp)e.getKey();
String v=(String)e.getValue();
System.out.println(k.id+"= "+v);
}
hm.clear();//clear() yeh puri map khaali kr dega
System.out.println("Is HashMap empty"+hm.isEmpty());
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