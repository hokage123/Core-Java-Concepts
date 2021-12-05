class Anki218
{
public static void main(String s[])
{
try
{
int z[]=new int[s.length];
z[10]=1000;
}
catch(ArrayIndexOutOfBoundsException e)
{
	System.out.println(e);
}
catch(Exception e)
{} 
try
{
int x=10/s.length;
}
catch(ArithmeticException e)
{
System.out.println(e);
}
catch(Exception e)
{}
}
}