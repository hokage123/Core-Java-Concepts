class Anki42
{
int x,y;
void show()
{
System.out.println(x);
System.out.println(y);
}
}
class Arshav extends Anki42
{
void get(int x,int y)
{
this.x=x;
this.y=y;
}
public static void main(String... s)
{
Arshav c1=new Arshav();
c1.get(100,20);
c1.show();
}
}