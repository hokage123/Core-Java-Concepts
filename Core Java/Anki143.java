class Anki143
{
int x=19;
static int y=20;
 class Jalebi
{
	int x=12;
 void show()
{
System.out.println(x);
System.out.println(y);
System.out.println(Anki143.this.x);
}
}
public static void main(String... s)
{
Anki143 j=new Anki143();
System.out.println(j.x);
Anki143.Jalebi i=j.new Jalebi();
i.show();
}
}