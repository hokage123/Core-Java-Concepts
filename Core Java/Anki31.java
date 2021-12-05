class Anki31
{
int x;
int y;
Anki31(int x,int y)
{
this.x=x;
this.y=y;
}
void show()
{
System.out.println(x);
System.out.println(y);
}
Anki31(Anki31 z)
{
this.x=100;
this.y=200;
}
public static void main(String... s)
{
 Anki31 t1=new Anki31(10,20);
t1.show();
t1=null;
Anki31 t2=new Anki31(t1);
t2.show();
t1.show();
}
}