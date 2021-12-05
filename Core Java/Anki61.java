class Anki61
{
void show()
{
System.out.println("father");
}
}
class Innozu extends Anki61
{

void display()
{
System.out.println("display");
}
public static void main(String... s)
{
Anki61 a=new Innozu();
//Inno b=new Anki59();
a.show();
}
}