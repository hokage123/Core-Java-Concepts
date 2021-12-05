class Anki36
{
int x;
{
 x=10;
System.out.println("Init Block");
}
Anki36()
{
System.out.println(x);
System.out.println("default");
}
Anki36(int x)
{
System.out.println("parametrized"+x);
}
public static void main(String... s)
{
new Anki36();
new Anki36(5);
new Anki36();
}
{
System.out.println("second init");
}
}