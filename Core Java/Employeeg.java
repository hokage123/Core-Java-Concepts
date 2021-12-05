class Employeeg
{
String name;
int sal;
static String cname="dlf";
void get(String S1,int S2)
{
name=S1;
sal=S2;
}
void show()
{
System.out.println(name);
System.out.println(sal);
System.out.println(cname);
}
public static void main(String... s)
{
	Employeeg r1=new Employeeg();
	r1.get("lalu",1008);
r1.show();
Employeeg r2=new Employeeg();
r2.get("rabri",21);
r2.show();
	}
}