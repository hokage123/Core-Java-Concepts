class Anki140
{
int x=19;
static int y=20;
static class Jalebi extends Anki140
{
 void show()
{
System.out.println(x);
System.out.println(y);
}
}
}
class Do extends Anki138
{
public static void main(String... s)
{
System.out.println(y);
Jalebi i=new Jalebi();
i.show();
}
}