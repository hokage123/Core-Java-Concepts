class Anki152
{
int x=10;
static int y=20;
Anki153 display()
{
return(
	new Anki153()
	{
	public void show()
	{
	System.out.println(x);
	System.out.println(y);
	}
	}
	)
	;
	}
	public static void main(String... s)
	{
	Anki152 c=new Anki152();
			Anki153 z=c.display();
			z.show();
	}
}
interface Anki153
{
void show();
}