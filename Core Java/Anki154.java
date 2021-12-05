class Anki154
{
int x=10;
static int y=20;
void display(Anki155 s)
{
s.show();
}
public static void main(String... s)
{
Anki154 e=new Anki154();
e.display(new Hanu());
}
}
interface Anki155
{
void show();
}
class Hanu implements Anki155
{
public void show()
{
System.out.println("show");
}
}