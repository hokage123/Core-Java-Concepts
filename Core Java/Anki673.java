//FetchSize
//FetchSize matlab aap jab resultset uthayenge ek saath pura record nahi select query hai bhai stream hai default size 10 Statement ke setFetchSize() se val set phir resultset ke getFetchSize() se nikala toh vahi jo set magar agar ek baar selectQuery() chal gaya resultset mil gaya aur usne ResultSet ka method setFetchSize() chala diya phir jitna mann chaye Statement kaa setFetchSize() chalate raho koi farq nahi pdta hai 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
class Anki673
{
public static void main(String... s)throws Exception
{
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","12345");
//get the fetch size of statement
Statement stmt=conn.createStatement();
int fetchSize=stmt.getFetchSize();
System.out.println(fetchSize);
//set the fetchSize of statement
stmt.setFetchSize(100);
fetchSize=stmt.getFetchSize();
System.out.println(fetchSize);
//create a resultset
ResultSet resultset=stmt.executeQuery("select * from bank1");
fetchSize=resultset.getFetchSize();
System.out.println(fetchSize+"via resultset before");
//change the fetchSize of resultset
resultset.setFetchSize(200);
fetchSize=resultset.getFetchSize();
System.out.println(fetchSize+"via resultset after");
stmt.setFetchSize(500);
fetchSize=resultset.getFetchSize();
System.out.println(fetchSize+"via resultset after changing in statement");
}
}