//Statement three types ke Statement PreparedStatement CallableStatement
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
class Anki674
{
public static void main(String... s)
{
Statement st=null;
ResultSet rs=null;
try
{
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","12345");
st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
rs=st.executeQuery("select accno,bal from bank1");
while(rs.next())
{
System.out.println(rs.getString(1)+"=");
System.out.println(rs.getInt(2));
}
rs.moveToInsertRow();//moveToInsertRow() method ek record insert krwane ke liye kisi given position par cursor ko le jaata hai
rs.updateString(1,"accno106");
rs.updateInt(2,10000);
rs.insertRow();//insertRow() row insert kr deta hai
rs.beforeFirst();//beforeFirst() cursor ko first position se pehle le jaata hai
rs=st.executeQuery("select accno,bal from bank1");
while(rs.next())
{
System.out.println(rs.getString(1)+"=");
System.out.println(rs.getInt(2));
}
}
catch(Exception e)
{
System.out.println(e);
}
}
}