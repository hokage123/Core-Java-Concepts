//TestInsert1 bas type1 se
import java.sql.*;
class Anki669
{
public static void main(String... sl)
{
try
{
DriverManager.registerDriver(new sun.jdbc.odbc.JdbcOdbcDriver());
Connection c=DriverManager.getConnection("jdbc:odbc:student","system","12345");
String t1="audiq7";
int t2=1001;
int t3=30000;
Statement s=c.createStatement();
int x;
s.executeUpdate("create table emp1(name varchar(10),id number,salary number)");//executeUpdate() se action query perform yaani create update delete insert kitne record par number return
for(int i=0;i<4;i++)
{
 x=s.executeUpdate("insert into emp1 values('"+t1+"',"+t2+","+t3+")");
 t1=t1+7;
t2=t2+1;
t3=t3+1000;
System.out.println(x);
}
ResultSet result1=s.executeQuery("select * from emp1");//executeQuery() se select query perform yaani retreival
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