class Employee
{
String name;
int sal;
void get(String S1,int S2)
{
name=S1;
sal=S2;
}
void show()
{
System.out.println(name);
System.out.println(sal);
}
public static void main(String... s)
{
	Employee r1=new Employee();
	r1.get("lalu",1008);
r1.show();
Employee r2=new Employee();
r2.get("rabri",21);
r2.show();
	}
}