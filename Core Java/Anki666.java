import java.sql.*;
class Anki666
{
public static void main(String[] ss)
{
try
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection c=DriverManager.getConnection("jdbc:odbc:student","system","12345");
Statement s=c.createStatement();
ResultSet result1=s.executeQuery("select * from UAD");//executeQuery() retrieval select query ke liye ResultSet degi
while(result1.next())
{
System.out.println(result1.getString(2)+"="+result1.getString(3));
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