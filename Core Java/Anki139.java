class Anki139
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
class Tsunade extends Anki139.Jalebi
{
public static void main(String... s)
{

Tsunade t=new Tsunade();
t.show();
}
}