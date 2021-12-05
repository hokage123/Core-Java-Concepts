class Anki62
{
void show()
{
System.out.println("father");
}
}
class Yaminaka extends Anki62
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
Anki62 a=new Yaminaka();
//Inno b=new Anki59();
a.show();
Yaminaka y=(Yaminaka)a;
y.display();
}
}