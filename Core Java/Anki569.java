//HashMapDemo1
//Agar apni class ka obj as a key add karana hai toh use equals() method aur hashcode() dono method ko override krna hi padega taki hashCode kisi var par check nahi toh refid waala hashCode 
import java.util.*;
class Anki569
{
public static void main(String... h)
{
HashMap<Emp,String> hm=new HashMap<>();
System.out.println(hm.size());
hm.put(new Emp(10),"aaaa");
hm.put(new Emp(10),"bbbb");
hm.put(new Emp(10),"cccc");
hm.put(new Emp(10),"dddd");
Set s=hm.entrySet();
Iterator i=s.iterator();
while(i.hasNext())
{
Map.Entry e=(Map.Entry)i.next();
Emp k=(Emp)e.getKey();
String v=(String)e.getValue();
System.out.println(k.id+"= "+v);
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