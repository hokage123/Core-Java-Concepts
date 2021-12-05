class Anki210
{
public static void main(String s[])
{
try//try without catch not allowed 
{
int x=10/s.length;
System.out.println(x);
int z[]=new int[s.length];
z[10]=1000;
}
catch(ArithmeticException e)
{
	System.out.println(e);
}

}
}