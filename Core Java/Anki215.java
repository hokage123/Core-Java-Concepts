class Anki215
{
public static void main(String s[])
{
try
{
int x=10/s.length;
System.out.println(x);
int z[]=new int[s.length];
z[10]=1000;
}
catch(ArithmeticException|ArrayIndexOutOfBoundsException e)//parent child relationship not allowed
{
System.out.println(e);
}

	
}
}