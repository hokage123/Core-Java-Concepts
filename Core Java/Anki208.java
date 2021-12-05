class Anki208
{
public static void main(String... s)
{
try//try without catch not allowed 
{
int x=10/0;
System.out.println(x);//line between exception and catch is escaped
}
//System.out.println("Sexy Boobs");//error only space allowed between try and catch 
catch(ArithmeticException e)
{
	//int y=10/0;//never write any statement generating exception in catch block nahi to wahi par terminate 
	System.out.println(e);
}
System.out.println("this will not printed");
}
}