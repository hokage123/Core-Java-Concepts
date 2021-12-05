//MyObjectNCopies
import java.util.Collections;
import java.util.List;
class Anki621
{
public static void main(String... s)
{
String temp="lalu";
List<String> tempCopies=Collections.nCopies(5,temp);//nCopies() me number kitni copy banani hai aur object pass utni copy banakar uska list return
System.out.println(tempCopies);
Empy emp=new Empy(10,"Rabari",25);
List<Empy> empCopies=Collections.nCopies(5,emp);
for(Empy e:empCopies)
System.out.println(e);
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
public String toString()
{
return id+" "+name+" "+salary;
}
}