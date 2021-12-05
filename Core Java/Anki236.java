class Anki236
{
int age;
void get(int age)throws AgException
{
if(age<18)
{
throw new AgException("invalid hai bhosadike");
}
else
{
this.age=age;
}
}
public static void main(String... s)
{
Anki236 a=new Anki236();
try
{
a.get(10);
}
catch(AgException e)
{
System.out.println(e);
}
}
}
class AgException extends Exception
{
String S;
AgException(String S)
{
	this.S=S;
}
public String toString()
{
return S;
}
}