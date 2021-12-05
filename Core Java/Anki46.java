class Anki46
{
int x=50;
}
class Preeti extends Anki46
{
int x=20;
void show()
{
System.out.println(x);
System.out.println(super.x);
}
public static void main(String... s)
{
Preeti c1=new Preeti();
c1.show();
}
}