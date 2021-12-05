//ResultSetInsert
//MyUpdateResultSet
//ResultSet ke seven static constants hai
//1 TYPE_fORWARD_ONLY se sirf forward direction me move row1 se row2 row2 se row3 row2 se row1 nahi
//2 TYPE_SCROLL_INSENSITIVE se forward bhi backward bhi move kisi particular index par bhi chal jaati hai par kisi aur thread ne agar database me change hamare ResultSet me reflect nahi
//3 TYPE_SCROLL_SENSITIVE se forward bhi backward bhi move kisi particular index par bhi chal jaati hai par kisi aur thread ne agar database me change hamare ResultSet me reflect hoga
//4 CONCUR_READ_ONLY se ResultSet sirf read update nahi
//5 CONCUR_UPDATABLE se ResultSet read bhi update 
//6 CLOSE_CURSORS_OVER_COMMIT se Connection ke commit() ko chalane se pehle ResultSet close koi transaction nahi possible
//7 HOLD_CURSORS_OVER_COMMIT se Connection ke commit() ko chalane se baad bhi ResultSet open sari transaction  possible
//yeh static constants Statement me as a argument jaata hai batane ke liye resultset kis type kaa 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
class Anki670
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
rs.next();
rs.next();
rs.deleteRow();
System.out.println("record deleted");
}
catch(Exception e)
{
System.out.println(e);
}
}
}