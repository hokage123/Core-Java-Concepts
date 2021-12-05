class Anki51
{
void show()
{
System.out.println("father");
}
}
class Avi extends Anki51
{
void show()
{
System.out.println("child");
}
public static void main(String... s)
{
Avi c1=new Avi();
c1.show();
}
}