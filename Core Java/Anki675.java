//PreparedStatement
//PreparedStatement se baar baar query nahi setInt() setString() se value daal de runtime par pehle ?? dekar chalaya
import java.sql.*;
import java.io.*;
class Anki675
{
public static void main(String... f)
{
try
{
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","12345");
int t1=123;
String t2="lalu";
String t3="23455";
Statement s=c.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
s.executeUpdate("create table emp65(id number,name varchar(20),phno varchar(20))");
s.close();
PreparedStatement ps=c.prepareStatement("insert into emp65 values(?,?,?)",ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);//prepareStatement() me sql string pass aur ResultSet ke const pass batane ke liye resultset kaisa hai 
//PreparedStatement ps=c.prepareStatement("insert into emp66 values(?,?)");
ps.setInt(1,t1);
ps.setString(2,t2);
ps.setString(3,t3);
//ps.executeUpdate();//executeUpdate() se hi jaakar database par update krta hai
//ps.close();

ps.setInt(1,t1+1);
ps.setString(2,t2+1);
ps.setString(3,t3+1);
ps.executeUpdate();
ps.close();
ps=c.prepareStatement("select * from emp65 where id=?");
ps.setInt(1,t1+1);
ResultSet result1=ps.executeQuery();
while(result1.next())
{
System.out.println(result1.getInt(1));
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