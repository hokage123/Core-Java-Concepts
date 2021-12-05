interface Anki75
{
void show();
}
interface Anki76
{
void show();
}
class Jace implements Anki75,Anki76
{
public void show()
{
System.out.println("show");
}

public static void main(String... s)
{
Jace c1=new Jace();
Jile t1=new Jile();
t1.register(c1);
Jini t2=new Jini();
t2.regist(c1);
}
}
class Jile
{
public void register(Anki75 A)
{
A.show();
}
}
class Jini
{
public void regist(Anki76 D)
{
D.show();
}
}