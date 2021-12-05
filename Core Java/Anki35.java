class Anki35
{
{
System.out.println("Init Block");
}
Anki35()
{
System.out.println("default");
}
Anki35(int x)
{
System.out.println("parametrized");
}
public static void main(String... s)
{
new Anki35();
new Anki35(10);
new Anki35();
}
}