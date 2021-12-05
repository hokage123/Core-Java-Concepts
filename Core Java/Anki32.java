class Anki32
{
Anki32()
{
this(10);
System.out.println("default");
}
Anki32(int x)
{
this(10,20);
System.out.println(x);
}
Anki32(int x,int y)
{
System.out.println(x+y);
}
public static void main(String... s)
{
new Anki32();
}
}