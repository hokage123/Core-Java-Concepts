//RowSet database se persistent connection nahi banakar rkta ResultSet ki tarah yeh setUrl() setCommand() ki tarah kuch method provide
//RowSet yaa toh connected yaa disconnected connected jo persistent connection banakar rkhe sirf JdbcRowSet disconnected jo persistent connection banakar nahi rkhe 
//RowSetDemo
import java.sql.*;
import javax.sql.rowset.RowSetProvider;
import javax.sql.*;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.JdbcRowSet;
class Anki678
{
public static void main(String... s)
{
String url="jdbc:oracle:thin:@localhost:1521:xe";
String username="system";
String password="12345";
try
{
Class.forName("oracle.jdbc.driver.OracleDriver");
//first,create a factory obj for RowSet
RowSetFactory rowSetFactory=RowSetProvider.newFactory();
 //create a jdbc rowSet from the factory
 JdbcRowSet rowSet=rowSetFactory.createJdbcRowSet();
 //set Connection Properties
 rowSet.setType(ResultSet.TYPE_SCROLL_SENSITIVE);
 rowSet.setConcurrency(ResultSet.CONCUR_UPDATABLE);
 rowSet.setUrl(url);
 rowSet.setUsername(username);
 rowSet.setPassword(password);
 //set sql query to execute
rowSet.setCommand("select * from emp65");
rowSet.execute();
System.out.println("id\tname\tphno");
while(rowSet.next())
{
System.out.println(rowSet.getString("id")+"\t"+rowSet.getString("name")+"\t"+rowSet.getString("phno"));
}
 }
 catch(Exception e)
 {
 e.	printStackTrace();
 }
}
}