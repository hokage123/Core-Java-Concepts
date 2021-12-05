class Anki212
{
public static void main(String s[])
{
try 
{
int x=10/0;
}
catch(ArrayIndexOutOfBoundsException e)
{
	System.out.println(e);
}
catch(Exception e)
{
System.out.println(e);
}
}
}