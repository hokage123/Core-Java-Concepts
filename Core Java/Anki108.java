interface Anki108
{
void show();
}
class Raju
{
public void show()
{
System.out.println("show");
}
}
class Kaju extends Raju implements Anki108
{
public static void main(String... s)
{
Anki108 e=new Kaju();
e.show();
}
}