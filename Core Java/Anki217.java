class Anki217
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
//catch statements ko child to parent ke order me likho nahi to error already caught Exception
catch(Exception e)
	{}
catch(ArithmeticException e)
{
	System.out.println("jaajaa");
}
catch(Error e)
	{}
	catch(Throwable e)
	{}
	
	}
}