class Anki54
{
protected void show()
{
System.out.println("Father");
}
}
class Chocho extends Anki54
{
public void show()
{
	super.show();
System.out.println("Child");
}
public static void main(String... s)
{
Chocho r1=new Chocho();
r1.show();
}
}