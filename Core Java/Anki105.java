class Anki105
{
final int x=this.getx();
int getx()
{
System.out.println(x);
System.out.println("via get function");
return 10;
}
Anki105()
{
System.out.println(this.x+"via constructor");
}
public static void main(String... s)
{
new Anki105();
}
}