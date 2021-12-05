class Anki53
{
private void show()
{
System.out.println("Father");
}
}
class Chozi extends Anki53
{
private void show()
{
	super.show();
System.out.println("Child");
}
public static void main(String... s)
{
Chozi r1=new Chozi();
r1.show();
}
}