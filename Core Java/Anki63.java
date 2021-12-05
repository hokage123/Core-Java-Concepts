class Anki63
{
int x=50;
void show()
{
System.out.println("Father");
}
}
class Rep extends Anki63
{
int x=20;
void show()
{
System.out.println("Child");
}
void display()
{
System.out.println("display");
}
public static void main(String... s)
{
Anki63 r=new Rep();
System.out.println(r.x);
}
}