//TestInsert
//jo kaam driver class yaani Driver interface ko implement krne waali class ko load forName() se toh woh andar se registerDriver() hi chalakar driver class ko register yeh yahan seeda chala diya 
import java.sql.*;
class Anki662
{
public static void main(String... l)
{
try
{
DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","12345");
int t1=22;
String t2="akshita";
String t3="phd";
Statement s=c.createStatement();
int x=s.executeUpdate("insert into emp values("+t1+",'"+t2+"','"+t3+"')");//executeUpdate() se action query perform yaani create update delete insert kitne record par number return
System.out.println(x);
ResultSet result1=s.executeQuery("select * from emp");//executeQuery() se select query perform yaani retreival
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