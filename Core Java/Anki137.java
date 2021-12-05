class Anki137
{
int x=19;
static int y=20;
static class Jalebi
{
 void show()
{
//System.out.println(x);
System.out.println(y);
}
}
}
class Ojana
{
public static void main(String... s)
{
System.out.println(Anki137.y);
Anki137.Jalebi i=new Anki137.Jalebi();
}
}