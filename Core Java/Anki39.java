class Anki39
{
static int x;
static
{
	System.out.println("static");
try
{x=System.in.read();
}
catch(Exception e)
{
}
}
}
class Anki39a
{
public static void main(String... s)
{
System.out.println(Anki39.x);
System.out.println(Anki39.x);
}
}
class Anki39b
{
public static void main(String... s)
{
System.out.println(Anki39.x);
}
}