class Anki156
{
int x=10;
static int y=20;
void display(Anki157 s)
{
s.show();
}
public static void main(String... s)
{
Anki156 e=new Anki156();
e.display(
		new Anki157()
		{
		public void show()
		{
		System.out.println("someday i would be hokage");
		}
		}
	)
	;
}
}
interface Anki157
{
void show();
}