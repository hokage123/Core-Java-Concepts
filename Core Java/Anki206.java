class Anki206
{
public static void main(String... s)
{
try//try without catch not allowed 
{
int x=10/0;
System.out.println(x);//line between exception and catch is escaped
}
catch(ArithmeticException e)
{
	System.out.println(e);
}
System.out.println("this will not printed");
}
}