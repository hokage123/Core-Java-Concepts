class Anki25
{
void show()
{
System.out.println("show");
}
Anki25(int x)
{
System.out.println(x);
}
public static void main(String... s)
{
Anki25 t=new Anki25();
t.show();
}
Anki25()
{
	System.out.println("default");
}
}