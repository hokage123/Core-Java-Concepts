class Anki133
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
public static void main(String... s)
{
System.out.println(y);
Jalebi v=new Jalebi();
v.show();
}
}