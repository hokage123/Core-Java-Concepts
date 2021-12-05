class Anki146
{
int x=19;
static int y=20;
 class Jalebi
{
 void show()
{
System.out.println(x);
System.out.println(y);
}
}
}
class Jaggu extends Anki146
{
public static void main(String... s)
{
Jaggu j=new Jaggu();
System.out.println(j.x);
Jaggu.Jalebi i=j.new Jalebi();
i.show();
}
}
