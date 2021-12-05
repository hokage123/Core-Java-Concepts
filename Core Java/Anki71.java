abstract class Anki71
{
int x;
int y;
void show()
{
System.out.println(x);
System.out.println(y);
}
Anki71()
{
	this(34);
	System.out.println("Anki71");
}
Anki71(int x)
{
	System.out.println(x);
}
abstract void display();
void register(Anki71 b)
{
b.display();
}
}
 class Kurama extends Anki71
{
	void display()
	{
		System.out.println("display");
	}
void get(int x,int y)
{
this.x=x;
this.y=y;
}
Kurama()
{
	System.out.println("kurama");
}
public static void main(String... s)
{
Kurama c1=new Kurama();
c1.get(10,20);
c1.show();
c1.register(c1);
}
}