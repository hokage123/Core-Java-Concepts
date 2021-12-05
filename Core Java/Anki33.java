class Anki33
{
Anki33()
{
this(10,20);
System.out.println("default");
}
Anki33(int x)
{
this();
System.out.println(x);
}
Anki33(int x,int y)
{

System.out.println(x+y);
}
public static void main(String... s)
{
new Anki33(10);
}
}