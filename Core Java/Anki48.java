class Anki48
{
int x=50;
}
class Arrav extends Anki48
{
int y=20;
void show()
{
System.out.println(y);
System.out.println(super.x);
}
public static void main(String... s)
{
Arrav c1=new Arrav();
c1.show();
}
}