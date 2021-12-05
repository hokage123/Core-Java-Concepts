class Anki29
{
int x=this.getx();
int getx()
{
System.out.println(x+"via get func");
return 10;
}
Anki29()
{
System.out.println(this.x+"via constructor");
}
public static void main(String... s)
{
new Anki29();
}
}