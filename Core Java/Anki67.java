class Anki67
{
Anki67()
{
System.out.println("Anki67"); 
}
}
class By extends Anki67
{
By()
{
System.out.println("B");
}
}
class Cy extends By
{
Cy()
{
this(10);
System.out.println("C");
}
Cy(int x)
{
System.out.println(x);
}
{
System.out.println("init");
}
public static void main(String... s)
{
new Cy();
new Cy(27);
}
}