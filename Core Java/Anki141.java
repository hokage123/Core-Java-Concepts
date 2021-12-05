class Anki141
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
public static void main(String... s)
{
Anki141 j=new Anki141();
System.out.println(j.x);
Anki141.Jalebi i=j.new Jalebi();
i.show();
}
}