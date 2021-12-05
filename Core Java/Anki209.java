/*try
{
int x=10/0;
System.out.println(x);
}
catch(ArithmeticException e)
{
	System.out.println(e);
}*/
//class ke bahar try catch not allowed
class Anki209
{
	/*try 
{
int x=10/0;
System.out.println(x);
}
catch(ArithmeticException e)
{
	System.out.println(e);
}*/
{
try 
{
int x=10/0;
System.out.println(x);
}
catch(ArithmeticException e)
{
	System.out.println(e);
}
}

Anki209()
{
	try
{
int x=10/0;
System.out.println(x);
}
catch(ArithmeticException e)
{
	System.out.println(e);
}
}
public static void main(String... s)
{
	int a=0;
System.out.println("this will not printed");
new Anki209();
if(a==0)
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
}
}
}