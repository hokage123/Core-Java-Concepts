//ArrayListEmpToArray
import java.util.*;
class Anki546
{
public static void main(String... s)
{
ArrayList<Emp> al=new ArrayList<>();
al.add(new Emp(1001,"lalu"));
al.add(new Emp(1002,"rabari"));
al.add(new Emp(1003,"meesa"));
al.add(new Emp(1004,"Tej"));
Object o[]=al.toArray();
for(int i=0;i<o.length;i++)
{
Emp z=(Emp)o[i];
System.out.println(z.id);
System.out.println(""+z.name);
System.out.println("");
}
System.out.println("");
for(Emp z:al)
{
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
}