class Anki66
{
Anki66()
{
System.out.println("Anki66"); 
}
}
class Bi extends Anki66
{
Bi()
{
System.out.println("Bi");
}
}
class Ci extends Bi
{
Ci()
{
this(10);
System.out.println("C");
}
Ci(int x)
{
System.out.println(x);
}
public static void main(String... s)
{
new Ci();
new Ci(27);
}
}