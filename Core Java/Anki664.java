//TestUpdate
//ab properties ke obj ke form me username password pass  aur Driver ko implement krne wali class se direct connect() url aur username password  ke jagah Properties ka obj pass jisme woh put pass krke jo getConnection() ke andar se chalta th
import java.sql.*;
import java.util.*;
class Anki664
{
public static void main(String... sn)
{
try
{
Driver d=new oracle.jdbc.driver.OracleDriver();
Properties dbprop=new Properties();
dbprop.put("user","system");
dbprop.put("password","12345");
Connection c=d.connect("jdbc:oracle:thin:@localhost:1521:xe",dbprop);
String z="audiq7";
String t4="1003";
Statement s=c.createStatement();
int z1=s.executeUpdate("update emp1 set name='"+z+"'where id<="+t4);//executeUpdate() se action query perform yaani create update delete insert kitne record par number return yahan update where clause condtn kise update
System.out.println(z1);
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