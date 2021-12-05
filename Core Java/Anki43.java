class Anki43
{
int x,y;
void show()
{
System.out.println(x);
System.out.println(y);
}
}
class Arshad extends Anki43
{
void get(int x,int y)
{
this.x=x;
this.y=y;
}
public static void main(String... s)
{
Arshad c1=new Arshad();
c1.get(10,20);
c1.show();
}
}
class Abhi extends Ajit
{
public static void main(String... s)
{
Abhi c1=new Abhi();
c1.get(102,20);
c1.show();
}
}