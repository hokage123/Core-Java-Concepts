//ArraysSortComp
//Agar array me apne class ke obj rakhne hai aur Comparable implement nahi compareTo() override bhi nahi krana toh  Arrays ka sort() overloaded  waala use karo array bhejo saath saath Comparator ko implement krne waali class ka bhi ref bhejo jisne compare() override kr rakha hoga
import java.util.*;
class Anki640
{
public static void main(String... s)
{
Empl[] e=new Empl[]{new Empl("lalu",101),new Empl("ju",10),new Empl("meesa",21),new Empl("tej",31)};
Arrays.sort(e,new MySalaryComp());
System.out.println("sorted array entries via salary");
for(Empl e1:e)
System.out.println(e1.name+"="+e1.getSalary());
Arrays.sort(e,new MyNameComp());
System.out.println("sorted array entries via name");
for(Empl e1:e)
System.out.println(e1.name+"="+e1.getSalary());
}
}
class MySalaryComp implements Comparator<Empl>
{
@Override
public int compare(Empl e1,Empl e2)
{
if(e1.getSalary()>e2.getSalary())
return 1;
else
return -1;
}
}
class MyNameComp implements Comparator<Empl>
{
@Override
public int compare(Empl e1,Empl e2)
{
return e1.name.compareTo(e2.name);
}
}
class Empl
{
String name;
int salary;
Empl(String name,int salary)
{
this.name=name;
this.salary=salary;
}
int getSalary()
{
return salary;
}
}