class Anki136
{
int x=19;
static int y=20;
static class Jalebi
{
static void show()
{
//System.out.println(x);
System.out.println(y);
}
}
}
class Jaleba
{
public static void main(String... s)
{
System.out.println(Anki136.y);
Anki136.Jalebi.show();
}
}