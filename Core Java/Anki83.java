interface Anki83
{
default void show()
{
System.out.println("Anki82");
}
}
class Chill implements Anki83
{
public static void main(String... s)
{
Anki83 A=new Chill();
A.show();
}
}