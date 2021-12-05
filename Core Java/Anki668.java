//TestDelete bas Type1 driver se
//hum System ki setProperty() me OracleDriver ko set kr de aur phir username password Properties class ke obj ke form me hai toh getConnection() me seede url aur Properties ka woh obj chala jayega tab bhi connection database se banega
import java.sql.*;
import java.util.*;
class Anki668
{
public static void main(String... h)
{
	try
	{
System.setProperty("jdbc.drivers","sun.jdbc.odbc.JdbcOdbcDriver");
Properties dbprop=new Properties();
dbprop.put("user","system");
dbprop.put("password","12345");
Connection c=DriverManager.getConnection("jdbc:odbc:student",dbprop);
String t5="Admin";
Statement s=c.createStatement();
int a=s.executeUpdate("delete from UAD where Type<='"+t5+"'");//executeUpdate() se action query perform yaani create update delete insert kitne record par number return yahan delete where clause condtn kise delete
ResultSet result1=s.executeQuery("select * from UAD");
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