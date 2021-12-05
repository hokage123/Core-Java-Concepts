class Anki224
{
public static void main(String s[])
{
try//try without catch  allowed only with finally but only only one try can have only one finally
{
int x=10/s.length;
System.out.println(x);
}
finally
{
System.out.println("Honeysingh"); 
}
finally
{
System.out.println("Moneysingh"); 
}
}
}