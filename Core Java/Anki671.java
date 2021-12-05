//MyUpdatableResult1
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
class Anki671
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
if(rs.getString(1).equals("accno1"))
{
rs.updateInt(2,50002);
rs.updateRow();//yeh database par jaakar update seede ResultSet se update nahi ho pata krna pdta hai
System.out.println("record updated");
}
}
}
catch(Exception e)
{
System.out.println(e);
}
}
} 