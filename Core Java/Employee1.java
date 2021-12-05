class Employee1
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
	Employee1 r1=new Employee1();
	r1.get("lalu",1008);
r1.show();
Employee1 r2=r1;
r2.get("rabri",21);
r2.show();
r1.show();
	}
}