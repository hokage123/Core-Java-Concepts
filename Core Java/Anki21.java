class Anki21
{
String name;
String college;
int salary;
static String company="Garammasala";
 Anki21()
{
System.out.println("do employee aa gaye");
this.salary =15000;
}
void get(String S1,String S2)
{
name=S1;
college=S2;
}
void show()
{
System.out.println(name);
System.out.println(college);
System.out.println(company);
}
public static void main(String... s)
{
	new Anki21();
Anki21 t1=new Anki21();
t1.get("Asimaa","jss");
t1.show();
Anki21 t2=new Anki21();
t2.get("Naruto","Hidden leaf");
t2.show();
System.out.println(t1.salary);
System.out.println(t2.salary);

}
}