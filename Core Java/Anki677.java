//CallableStatement
//Calling functions
//CallableStatement kisi bhi database me jaata hai function,Procedure ke through    function me val return procedure me nahi 
//niche likha comment runSqlCommandLine me jaakar function banane ke liye
/* create or replace function sum22(one in number,two in number)
	return number as
	total number;
	begin
	total:=one+two;
	return total;
	end;
	/
	*/
import java.sql.*;
import java.io.*;
class Anki677
{
public static void main(String... s)
{
try
{
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","12345");
CallableStatement cs=c.prepareCall("{?=call sum22(?,?)}");
cs.setInt(2,10);
cs.setInt(3,20);
	cs.registerOutParameter(1,Types.INTEGER);//registerOutParameter() return type kaisa  hai batane ke liye
	cs.execute();//execute() se database me saari changes aa gayi
	int a=cs.getInt(1);
	System.out.println(a);
}
catch(Exception e)
{
System.out.println(e);
}
}
}