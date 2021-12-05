class Anki58
{
}
class Inno extends Anki58
{
void show()
{
System.out.println("child");
}
public static void main(String... s)
{
Anki58 a=new Inno();
a.show(); 
}
}