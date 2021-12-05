abstract class Anki69
{
int x;
int y;
void show()
{
System.out.println(x);
System.out.println(y);
}
abstract void display();
}
class Chiaanim extends Anki69
{
void get(int x,int y)
{
this.x=x;
this.y=y;
}
void display()
{
	System.out.println("display");
}
public static void main(String... s)
{
Chiaanim c1=new Chiaanim();
c1.get(10,20);
c1.show();
c1.display();
}
}