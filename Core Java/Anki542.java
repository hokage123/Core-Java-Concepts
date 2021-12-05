//MyArrayListSort
//via Comparator interface you can have a sorting on one feild of an obj via Comparator interface you can have sorting on multiple feild of an obj
//Comparator kaa compare() method hum teen classes banayange MyNameComparator compare(Empl e1,Empl e2)me name comparison kaa logic MySalaryComparator compare(Empl e1,Empl e2)me salary comparison kaa logic MyIdComparator compare(Empl e1,Empl e2)me id comparison kaa logic 
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
class Anki542
{
public static void main(String... s)
{
ArrayList<Empl> list=new ArrayList<>();
list.add(new Empl("Ram",3000));
list.add(new Empl("John",6000));
list.add(new Empl("Crish",2000));
list.add(new Empl("Tom",2400));
Collections.sort(list,new MySalaryComp());//ab Empl ko Comparable implement krne ki zarroorat nahi sort(ArrayList g,Comparator c) 
for(Empl e:list)
System.out.println(e.getSalary());
Collections.sort(list,new MyNameComp());
for(Empl e:list)
System.out.println(e.name);
}
}
class MySalaryComp implements Comparator<Empl>
{
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