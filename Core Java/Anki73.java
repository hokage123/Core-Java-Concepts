interface Anki73
{
void show();
}
interface Anki74
{
void display();
}
class Jac implements Anki73,Anki74
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
Jac c1=new Jac();
Jil t1=new Jil();
t1.register(c1);
Jin t2=new Jin();
t2.regist(c1);
}
}
class Jil
{
public void register(Anki73 A)
{
A.show();
}
}
class Jin
{
public void regist(Anki74 D)
{
D.display();
}
}