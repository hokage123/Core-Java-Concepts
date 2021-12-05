class Anki225
{
public static void main(String s[])
{
try//if finally be written with catch it must be last one
{
int x=10/s.length;
System.out.println(x);
}
finally
{
System.out.println("Honeysingh"); 
}
catch(ArithmeticException e)
{
	System.out.println(e);
}

}
}