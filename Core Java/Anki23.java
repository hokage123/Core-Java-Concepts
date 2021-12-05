class Anki23
{
int salary;
Anki23()
{
salary=123400;
}
void show()
{
System.out.println(salary);
}
public static void main(String... s)
{
System.out.println(new Anki23().salary );
System.out.println(new Anki23());
new Anki23().show();
}
}