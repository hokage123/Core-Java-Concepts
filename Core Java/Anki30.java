class Anki30
{
int x;
int y;
Anki30(int x,int y)
{
this.x=x;
this.y=y;
}
void show()
{
System.out.println(x);
System.out.println(y);
}
Anki30(Anki30 z)
{
this.x=z.x;
this.y=z.y;
}
public static void main(String... s)
{
 Anki30 t1=new Anki30(10,20);
t1.show();
Anki30 t2=new Anki30(t1);
t2.show();
}
}