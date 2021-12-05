class Anki52
{
A show()
{
System.out.println("father");
return new A();
}
}
class Aryan extends Anki52
{
B show()
{
System.out.println("child");
super.show();
return new B();
}
public static void main(String... s)
{
Aryan c1=new Aryan();
c1.show();
}
}
class A 
{
}
class B extends A 
{
}