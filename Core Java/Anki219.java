class Anki219
{
public static void main(String s[])
{
try
{
try
{
int z[]=new int[s.length];
z[10]=1000;
}
catch(ArrayIndexOutOfBoundsExceptionException e)
{
	System.out.println(e);
}
try
{
int x=10/s.length;
}
catch(ArithmeticException e)
{
System.out.println(e);
}
}
catch(Exception e)
{}
}
}