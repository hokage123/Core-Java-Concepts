interface Anki107
{
void show();
}
class Uchia implements Anki107
{
public void show()
{
System.out.println("show");
}
public String toString()
{
return "Hello";
}
public static void main(String... s)
{
Anki107 h=new Uchia();
String c=h.toString();
System.out.println(c);
}
}