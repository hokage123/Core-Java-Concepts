interface Anki84
{
default void show()
{
System.out.println("Anki84");
}
}
interface Anki85
{
default void show()
{
System.out.println("Anki85");
}
}
class Chil implements Anki84,Anki85
{
	public void show()
{
System.out.println("show");
}
public static void main(String... s)
{
Anki84 A=new Chil();
A.show();
Anki85 C=new Chil();
C.show();
}
}