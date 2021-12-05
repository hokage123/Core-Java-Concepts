class Anki27
{
int x;
int y;
Anki27(int x,int y)
{
this.x=x;
this.y=y;
}
void show()
{
System.out.println(x+" "+y);
}
public static void main(String... s)
{
Anki27 t1=new Anki27(10,20);
t1.show();
Anki27 t2=new Anki27(12,90);
t2.show();
}
}