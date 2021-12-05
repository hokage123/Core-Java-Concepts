//ArrayListEmp
import java.util.ArrayList;
class Anki545
{
public static void main(String... s)
{
ArrayList<Emp> list=new ArrayList<Emp>();
list.add(new Emp(1001));
list.add(new Emp(1002));
list.add(new Emp(1003));
list.add(new Emp(1004));
list.add(new Emp(1005));
System.out.println("actual ArrayList");
for(Emp str:list)
System.out.println(str.x);
Emp[] strArr=new Emp[list.size()];
list.toArray(strArr);
System.out.println("created array list");
for(Emp str:strArr)
System.out.println(str.x);
}
}
class Emp//implements Clonneable
{
int x;
Emp(int x)
{
this.x=x;
}
}