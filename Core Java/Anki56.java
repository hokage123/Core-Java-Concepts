class Anki56
{
final void show()
{
System.out.println("Father");
}
}
class Choz extends Anki56
{
 void show()
{
	super.show();
System.out.println("Child");
}
public static void main(String... s)
{
Choz r1=new Choz();
r1.show();
}
}