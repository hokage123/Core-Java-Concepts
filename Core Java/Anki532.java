//MyArrayListReverse
import java.util.ArrayList;
import java.util.Collections;
class Anki532
{
public static void main(String... s)
{
ArrayList<Emp> list=new ArrayList<Emp>();
list.add(new Emp(1001));
list.add(new Emp(1002));
list.add(new Emp(1003));
list.add(new Emp(1004));
list.add(new Emp(1005));
System.out.println("Actual List");
for(Emp e:list)
System.out.println(e.id);
Collections.reverse(list);//Collections ka reverse() andar hi andar Collection ko reverse()
System.out.println("results after reverse operation");
for(Emp e1:list)
System.out.println(e1.id);
}
}
class Emp
{
int id;
Emp(int id)
{
this.id=id;
}
}