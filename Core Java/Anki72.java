interface Anki72
{
void show();
}
class Jack implements Anki72
{
public void show()
{
System.out.println("show");
}
public static void main(String... s)
{
Jack c1=new Jack();
Jill t1=new Jill();
t1.register(c1);
}
}
class Jill
{
public void register(Anki72 A)
{
A.show();
}
}