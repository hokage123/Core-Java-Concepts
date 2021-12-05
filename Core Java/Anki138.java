class Anki138
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
class Don extends Anki138
{
public static void main(String... s)
{
System.out.println(y);
Jalebi i=new Jalebi();
i.show();
}
}