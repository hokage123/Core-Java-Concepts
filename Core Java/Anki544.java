//MyArrayListCloneEmp
import java.util.ArrayList;
class Anki544
{
public static void main(String... s)
{
ArrayList<Emp> list=new ArrayList<Emp>();
//adding element to the end
list.add(new Emp(1001));
list.add(new Emp(1002));
list.add(new Emp(1003));
list.add(new Emp(1004));
list.add(new Emp(1005));
System.out.println("Actual ArrayList");
for(Emp str:list)
System.out.println(str.x);
ArrayList<Emp> copy=(ArrayList<Emp>)list.clone();
System.out.println("cloned ArrayList");
for(Emp str:list)
System.out.println(str.x);
Emp e1=list.get(0);
Emp e2=copy.get(0);
//copy.set(0,(Emp)list.get(0).clone())//deepClonning
if(e1==e2)
System.out.println("shallow");
if(list!=copy)
System.out.println("clone");
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