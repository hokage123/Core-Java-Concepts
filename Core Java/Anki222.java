class Anki222
{
public static void main(String s[])
{
try//try without catch not allowed 
{
int x=10/s.length;
System.out.println(x);
}
catch(ArithmeticException e)
{
	System.out.println(e);
}
finally
{
System.out.println("Honeysingh"); 
}
}
}