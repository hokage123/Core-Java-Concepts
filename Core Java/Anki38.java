class Anki38
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
class Anki38a
{
public static void main(String... s)
{
System.out.println(Anki38.x);
}
}
class Anki38b
{
public static void main(String... s)
{
System.out.println(Anki38.x);
}
}