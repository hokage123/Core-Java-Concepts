interface Anki77
{
void show();
}
interface Anki78 extends Anki77
{
void display();
}
class Ja implements Anki77,Anki78
{
public void show()
{
System.out.println("show");
}
public void display()
{
System.out.println("display");
}
public static void main(String... s)
{
Ja c1=new Ja();
Jilu t1=new Jilu();
t1.register(c1);
Jinu t2=new Jinu();
t2.regist(c1);
}
}
class Jilu
{
public void register(Anki77 A)
{
A.show();
}
}
class Jinu
{
public void regist(Anki78 D)
{
D.show();
}
}