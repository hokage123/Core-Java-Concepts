class Anki57
{
void show()
{
System.out.println("father");
}
}
class Inno extends Anki57
{
void show()
{
System.out.println("child");
}
public static void main(String... s)
{
Anki57 a=new Inno();
//Inno b=new Anki57();
a.show();
}
}