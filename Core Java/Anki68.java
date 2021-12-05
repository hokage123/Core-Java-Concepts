abstract class Anki68
{
int x;
int y;
void show()
{
System.out.println(x);
System.out.println(y);
}
}
class Chia extends Anki68
{
void get(int x,int y)
{
this.x=x;
this.y=y;
}
public static void main(String... s)
{
Chia c1=new Chia();
c1.get(10,20);
c1.show();
}
}