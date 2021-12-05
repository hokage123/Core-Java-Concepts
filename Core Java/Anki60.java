class Anki60
{
void show()
{
System.out.println("father");
}
}
class Innoichi extends Anki60
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
Anki60 a=new Innoichi();
//Inno b=new Anki59();
a.show();
}
}