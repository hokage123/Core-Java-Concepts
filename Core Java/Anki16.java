class Anki16
{
void show(int x,long l)
{
System.out.println("int and long");
}
void show(long l,int x)
{
System.out.println("long and int");
}
public static void main(String... s)
{
Anki16 e4=new Anki16();
e4.show(10l,10);
e4.show(10,10l);
e4.show(10,10);
}
}