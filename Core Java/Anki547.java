//ArrayListEmpRemove
//if u want to perform any operation on any class object in ArrayList then that class must override equals() method of object class
import java.util.*;
class Anki547
{
public static void main(String... s)
{
ArrayList<Emp> al=new ArrayList<>();
al.add(new Emp(1001,"lalu"));
al.add(new Emp(1002,"rabari"));
al.add(new Emp(1003,"meesa"));
al.add(new Emp(1004,"Tej"));
Iterator<Emp> i=al.iterator();
while(i.hasNext())
{
Emp z=i.next();
System.out.println(z.id);
System.out.println(""+z.name);
System.out.println("");
}
Emp e=new Emp(1004,"tej");
al.remove(e);
System.out.println("after removing element");
i=al.iterator();
while(i.hasNext())
{
Emp z=i.next();
System.out.println(z.id);
System.out.println(""+z.name);
System.out.println("");
}
}
}
class Emp
{
int id;
String name;
Emp(int id,String name)
{
this.id=id;
this.name=name;
}
public boolean equals(Object o)//remove() bhi andar se equal chalata hai agar true return toh element remove nahi toh nahi
{
System.out.println("equals");
Emp e1=(Emp)o;
if(this.id==e1.id)
return true;
else
return false;
}
}