class Anki64
{
Anki64()
{
System.out.println("Anki64"); 
}
}
class B extends Anki64
{
B()
{
System.out.println("B");
}
}
class C extends B
{
C()
{
System.out.println("C");
}
C(int x)
{
System.out.println(x);
}
public static void main(String... s)
{
new C();
new C(27);
}
}