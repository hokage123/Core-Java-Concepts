class Anki18
{
int x=10;
void show(int x,Anki18 z)
{
System.out.println(z.x);
System.out.println(x);
}
public static void main(String... s)
{
Anki18 t=new Anki18();
t.show(20,t);
}
}