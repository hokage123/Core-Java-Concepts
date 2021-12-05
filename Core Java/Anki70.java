abstract class Anki70
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
abstract class Chiaani extends Anki70
{
void get(int x,int y)
{
this.x=x;
this.y=y;
}

public static void main(String... s)
{
//Chiaani c1=new Chiaani();
//c1.get(10,20);
//c1.show();
}
}