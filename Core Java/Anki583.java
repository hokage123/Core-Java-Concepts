//MyTreeMap
//Agar Comparable ko implement and compareTo() ko override nahi krna hai toh Comparator interface krne wali and compare() ko override krne waali class ka obj TreeMap ke constructor me bhejna padega
import java.util.*;
import java.util.Map.Entry;//ab Map ki Entry ko direct import toh use direct use kr skte hai bina Map. lagaye huye
class Anki583
{
public static void main(String... g)
{
Comparator m1=new MySalaryComp();
Comparator m2=new MyNameComp();
TreeMap t=new TreeMap(m1);
System.out.println("sorting with salary");
add(t);
show(t);
Empl em=(Empl)t.firstKey();//sorting order ke hisaab se first Key nikaal kr dega
System.out.println("lowest salary emp:"+em.salary);
Entry<Empl,String> ent=t.firstEntry();////sorting order ke hisaab se first Entry nikaal kr dega
System.out.println("Entry set value");
Empl k=(Empl)ent.getKey();
System.out.println(k.salary+"==>"+ent.getValue());
TreeMap t1=new TreeMap(m2);
add(t1);
show(t1);
em=(Empl)t1.firstKey();
System.out.println("lowest name emp:"+em.name);
ent=t1.firstEntry();
System.out.println("Entry set value");
 k=(Empl)ent.getKey();
System.out.println(k.name+"==>"+ent.getValue());
}
static void add(TreeMap t)
{
t.put(new Empl("lalau",101),"chaprasi");
t.put(new Empl("bhalu",102),"sweeper");
t.put(new Empl("rabari",51),"kaamwalibai");
t.put(new Empl("meesa",21),"chotikaamwalibai");
}
static void show(TreeMap t)
{
Set s=t.entrySet();
Iterator i=s.iterator();
while(i.hasNext())
{
Entry e=(Entry)i.next();
Empl k=(Empl)e.getKey();
String v=(String)e.getValue();
System.out.println(k.name+"="+k.salary+"value="+v);
}
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