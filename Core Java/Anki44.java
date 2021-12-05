class Anki44
{
int x,y;
void show()
{
System.out.println(x);
System.out.println(y);
}
}
class Ajit extends Anki44
{
void get(int x,int y)
{
this.x=x;
this.y=y;
}
public static void main(String... s)
{
Ajit c1=new Ajit();
c1.get(100,20);
c1.show();
}
}
class Hima extends Anki44
{
void getx(int x,int y)
{
this.x=x;
this.y=y;
}
public static void main(String... s)
{
Hima c1=new Hima();
c1.getx(10,20);
c1.show();
}
}