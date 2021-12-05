class Anki41
{
static Anki41a d;
static
{
d=new Anki41a();
}
}
class Anki41a
{
void show(int x)
{
System.out.println(x);
}
}
class Anki41b
{
public static void main(String... s)
{
Anki41.d.show(10);
System.out.println(10);
}
}