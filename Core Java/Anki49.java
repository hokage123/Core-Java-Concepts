class Anki49
{
int x=50;
}
class Arvi extends Anki49
{
int x=20;
void show()
{
System.out.println(x);
System.out.println(super.x);
System.out.println(this.x);
}
public static void main(String... s)
{
Arvi c1=new Arvi();
c1.show();
}
}