//MyEmpMinSalary
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
class Anki631
{
public static void main(String... s)
{
List<Empl> emps=new ArrayList<>();
emps.add(new Empl(10,"Raghu",25000));
emps.add(new Empl(120,"Krish",45000));
emps.add(new Empl(210,"john",14000));
emps.add(new Empl(150,"kishore",24000));
Empl minSal=Collections.min(emps);
System.out.println("employee with min salary"+minSal);
Empl maxSal=Collections.max(emps);
System.out.println("employee with max salary"+maxSal);
}
}
class Empl implements Comparable<Empl>
{
private int id;
private String name;
private Integer salary;
public Empl(int id,String name,Integer salary)
{
this.id=id;
this.name=name;
this.salary=salary;
}
public int getId()
{
return id;
}
public String getName()
{
return name;
}
public void setName(String name)
{
this.name=name;
}
public Integer getSalary()
{
return salary;
}
public void setSalary(Integer salary)
{
this.salary=salary;
}
@Override
public int compareTo(Empl emp)
{
return this.salary.compareTo(emp.getSalary());
}
public String toString()
{
return id+" "+name+" "+salary;
}
}