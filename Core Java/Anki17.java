class Anki17
{
void show(int x)
{
System.out.println("return void");
}
int show(int x)
{
System.out.println("return int");
return x;
}
public static void main(String[] args)
{
Anki17 e5=new Anki17();
int z=e5.show(10);
}
}