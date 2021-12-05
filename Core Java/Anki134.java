class Anki134
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
public static void main(String... s)
{
System.out.println(y);
Jalebi.show();
}
}