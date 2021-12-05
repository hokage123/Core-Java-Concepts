class Anki165
{
int x=100;
static int y=200;
Anki166 display()
{
return(
		new Anki166()
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
Anki165 a=new Anki165();
Anki166 b=a.display();
b.show();
}
}
interface Anki166
{
void show();
}