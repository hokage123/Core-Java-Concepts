//MyArrayListSort
//sort() method of Collections class can sort the obj of those class which are implementing Comparable interface by default
//Collections class ka sort() method me arraylist ko pass apne aap sorted order me kar dega kis hisaab se maan le Employee class ke char obj pehle name ke according sort phir id ke according sort phir id ke according sort phir salary ke according sort karega hi nahi sort yeh usi class ke obj hi sort jisne Comparable ko implement and compareTo() ko override
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
class Anki541
{
public static void main(String... s)
{
ArrayList<Empl> list=new ArrayList<>();
list.add(new Empl("Ram",3000));
list.add(new Empl("John",6000));
list.add(new Empl("Crish",2000));
list.add(new Empl("Tom",2400));
Collections.sort(list);
System.out.println("sorted list entries");
for(Empl e:list)
System.out.println(e.getSalary());
Empl e1=Collections.max(list);
Empl e2=Collections.min(list);
System.out.println(e1.salary);
System.out.println(e2.salary);
}
}
//Empl ne Comparable ko implement aur compareTo me salary ke according compare
class Empl implements Comparable<Empl>
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
public int compareTo(Empl e)//compareTo() me arg pehle obj type ka par Generic type introduced upar hi Comparable<> ke saath de diya
{
//System.out.println("sort");
if(this.salary>e.salary)
return 1;
else if(this.salary<e.salary)
return -1;
else
return 0;
}
}