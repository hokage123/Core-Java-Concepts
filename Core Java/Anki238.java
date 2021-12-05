final class Anki238
{

private final int x;
private Anki238(int x)
{
this.x=x;
}
public static Anki238 getinstance()
{
return new Anki238(20);
}
void show()
{
System.out.println("show me ur guts");
}
public static void main(String... s)
{
new	Anki238(10);
final Anki238a p=new Anki238a();
p.show1();
new Anki238a(p);
System.out.println(p);
new Anki238a(p);
System.out.println(p);
}
}
class Anki238a
{
public static void main(String... s)
{
Anki238 d=Anki238.getinstance();
d.show();
}
void show1()
{
System.out.println("show1 me ur guts");
}
 Anki238a(Anki238a a)
{
a.show1();
a=null;
}
Anki238a()
{
	
}
}