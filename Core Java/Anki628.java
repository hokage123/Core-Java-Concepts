//MyListBinarySearch
//binarySearch ke liye yaa toh ArrayList me jis class ke obj usse equals() override yaa Comparator ko implement krne waali class ka obj bhejna padega
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
class Anki628
{
public static void main(String... s)
{
List<Emp> empList=new ArrayList<>();
empList.add(new Emp(12,"lalu",500));
empList.add(new Emp(146,"rabari",200));
empList.add(new Emp(201,"meesa",400));
empList.add(new Emp(301,"lalubeta",44));
empList.add(new Emp(543,"lalupota",10));
Emp searchKey=new Emp(201,"meesa",400);
int index=Collections.binarySearch(empList,searchKey,new EmpComp());
System.out.println("index of the searched Key"+index);
}
}
class EmpComp implements Comparator<Emp>
{
@Override
public int compare(Emp e1,Emp e2)
{
if(e1.getEmpId()==e2.getEmpId())
{
return 0;
}
else
return -1;
}
}
class Emp
{
private int id;
private String name;
private int sal;
public Emp(int id,String name,int salary)
{
this.id=id;
this.name=name;
this.sal=salary;
}
public int getEmpId()
{
return id;
}
}