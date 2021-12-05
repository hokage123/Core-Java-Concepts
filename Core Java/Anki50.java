class Anki50
{
int x=50;
}
class Ayushi extends Anki50
{
int x=80;
}
class Siddu extends Ayushi
{
int x=20;
void show()
{
System.out.println(x);
System.out.println(((Ayushi)this).x);
System.out.println(((Anki50)this).x);
}
public static void main(String... s)
{
Siddu c1=new Siddu();
c1.show();
System.out.println(((Ayushi)c1).x);
System.out.println(((Anki50)c1).x);
}
}