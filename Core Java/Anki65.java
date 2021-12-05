class Anki65
{
Anki65()
{
System.out.println("Anki65"); 
}
}
class Bee extends Anki65
{
Bee(int x)
{
System.out.println("Bee");
}
Bee()
{
	System.out.println("B ka Default");
}
}
class Cee extends Bee
{
Cee()
{
System.out.println("Cee");
}
Cee(int x)
{
super(10);
System.out.println(x);
}
public static void main(String... s)
{
new Cee();
new Cee(27);
}
}