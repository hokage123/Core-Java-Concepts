class Anki34
{
Anki34()
{
System.out.println("default");
}
Anki34(int x)
{
this();
System.out.println(x);
}
Anki34(int x,int y)
{
Anki34(10);
System.out.println(x+y);
}
void Anki34(int x)
{
System.out.println(x);
}
public static void main(String... s)
{
new Anki34(10,20);
}
}