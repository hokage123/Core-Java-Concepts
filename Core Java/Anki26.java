class Anki26
{
int x;
int y;
Anki26()
{
x=10;
y=20;
}
void show()
{
System.out.println(x+" "+y);
}
public static void main(String... s)
{
Anki26 t1=new Anki26();
t1.show();
Anki26 t2=new Anki26();
t2.show();
}
}