class Anki167
{
int x=100;
static int y=200;
void display(Anki168 d)
{
d.show();
}
public static void main(String... s)
{
Anki167 e=new Anki167();
e.display(
			new Anki168()
			{
			public void show()
			{
			System.out.println("Anonymous");
			}
			}
			
			);

}
}
interface Anki168
{
void show();
}