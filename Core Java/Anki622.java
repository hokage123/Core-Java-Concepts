//agar apni class ke obj ko arrayList me add krna hai aur Collections ka max() min() chalana hai aur apni class se Comparable implement aur compareTo() ko override bhi nahi krne toh Comparator ko implement krne waali class ka obj bhejna padega 
//MyMaxComparator
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
class Anki622
{
public static void main(String... s)
{
List<Empy> emps=new ArrayList<>();
emps.add(new Empy(10,"Raghu",26000));
emps.add(new Empy(210,"john",14000));
emps.add(new Empy(211,"jhony",66000));
emps.add(new Empy(120,"krish",45000));
Empy maxSal=Collections.max(emps,new EmpyComp());
Empy minSal=Collections.min(emps,new EmpyComp());
System.out.println("Employee with max salary"+maxSal);
System.out.println("Employee with min salary"+minSal);
}
}
class EmpyComp implements Comparator<Empy>
{
@Override
public int compare(Empy e1,Empy e2)
{
return e1.getSalary().compareTo(e2.getSalary());
}
}
class Empy
{
private int id;
private String name;
private Integer salary;
public Empy(int id,String name,Integer salary)
{
this.id=id;
this.name=name;
this.salary=salary;
}
public Integer getSalary()
{
return salary;
}
public String toString()
{
return id+" "+name+" "+salary;
}
}