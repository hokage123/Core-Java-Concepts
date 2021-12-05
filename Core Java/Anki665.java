//TestDelete
//hum System ki setProperty() me OracleDriver ko set kr de aur phir username password Properties class ke obj ke form me hai toh getConnection() me seede url aur Properties ka woh obj chala jayega tab bhi connection database se banega
import java.sql.*;
import java.util.*;
class Anki665
{
public static void main(String... h)
{
	try
	{
System.setProperty("jdbc.drivers","oracle.jdbc.driver.OracleDriver");
Properties dbprop=new Properties();
dbprop.put("user","system");
dbprop.put("password","12345");
Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",dbprop);
int t5=1002;
Statement s=c.createStatement();
int a=s.executeUpdate("delete from emp1 where id<="+t5);//executeUpdate() se action query perform yaani create update delete insert kitne record par number return yahan delete where clause condtn kise delete
ResultSet result1=s.executeQuery("select * from emp1");
while(result1.next())
{
System.out.println(result1.getString(1));
System.out.println(result1.getString(2));
System.out.println(result1.getString(3));
}
}
catch(SQLException e)
{
System.out.println(e);
}
catch(Exception i)
{
System.out.println(i);
}
}
}