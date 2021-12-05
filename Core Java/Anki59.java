class Anki59
{
void show()
{
System.out.println("father");
}
}
class Inno extends Anki59
{
void show()
{
System.out.println("child");
}
void display()
{
System.out.println("display");
}
public static void main(String... s)
{
Anki59 a=new Inno();
//Inno b=new Anki59();
a.display();
}
}