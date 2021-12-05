//LinkedHashSetDemo1
//LinkedHashSet bhi LinkedHashMap ki tarah insertion order maintain aur set ka particular order bhi maintain kr skta hai
import java.util.*;
class Anki599
{
public static void main(String... s)
{
LinkedHashSet<Emp> al=new LinkedHashSet<>();
System.out.println(al.size());
al.add(new Emp(1002));
al.add(new Emp(1003));
al.add(new Emp(1002));
al.add(new Emp(1004));
al.add(new Emp(1001));
System.out.println(al.size());
Iterator<Emp> i=al.iterator();
while(i.hasNext())
{
Emp e=i.next();
System.out.println(e.id);
}
Emp e=new Emp(1002);
System.out.println("Does set contains key?"+al.contains(e));
al.remove(e);
i=al.iterator();
System.out.println("after removing element");
while(i.hasNext())
{
Emp e1=i.next();
System.out.println(e1.id);
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
System.out.println("inside equals");
Emp e=(Emp)o;
if(e.id==this.id)
return true;
else
return false;
}
public int hashCode()
{
System.out.println("inside hashcode");
return id*10;
}
}