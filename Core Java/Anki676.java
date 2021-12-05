//CallableStatement
//Calling Procedures
//CallableStatement kisi bhi database me jaata hai function,Procedure ke through    function me val return procedure me nahi 
//niche likha comment runSqlCommandLine me jaakar procedure banane ke liye
/*create or replace procedure anki
(id in emp65.id%type,name in
emp65.name%type)as
begin
insert into emp65 values(id,name);
end;
/
*/
import java.sql.*;
import java.io.*;
class Anki676
{
public static void main(String... i)
{
try
{
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","12345");
Statement s=c.createStatement();
CallableStatement cs=c.prepareCall("{call anki(?,?)}");
cs.setInt(1,122);
cs.setString(2,"feb1");
cs.executeUpdate();
ResultSet result1=s.executeQuery("select * from emp65");
while(result1.next())
{
System.out.println(result1.getString(1));
System.out.println(result1.getString(2));
}
}
catch(Exception  e)
{
System.out.println(e);
}
}
}