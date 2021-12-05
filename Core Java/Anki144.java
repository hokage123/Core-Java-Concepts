class Anki144
{
int x=10;
void show()
{
System.out.println(x);
System.out.println(this.x);
System.out.println(Anki144.this.x);
}
public static void main(String... s)
{
Anki144 n=new Anki144();
n.show();
}
}