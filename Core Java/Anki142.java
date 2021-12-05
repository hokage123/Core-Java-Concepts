class Anki142
{
int x=19;
static int y=20;
 class Jalebi
{
int x=17;
 void show()
{
System.out.println(x);
System.out.println(y);
}
}
public static void main(String... s)
{
Anki142 j=new Anki142();
System.out.println(j.x);
Anki142.Jalebi i=j.new Jalebi();
i.show();
}
}