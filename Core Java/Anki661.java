//Jdbc ki surwaat
//TestRetrieve
//database se connection ke liye char chize required 
//1 String ke form me class ka pura naam pass krke class load kyun kyunki chalana hai static block Driver ko implement krne waali class ka jiske andar se registerDriver() chalata hai OracleDriver kaa obj pass krke Driver par depend nahi obj par 
//2fir DriverManager ka getConnection() me connection ke liye ip  portnum socket jo url me aur username password  yehi url,username,password pass krke yeh Driver kaa connect chalata hai
//3Statement class ka obj crateStatement() Statement class serialized krke jo obj string me pass usse  stream ke form rk leta hai phir jab jarrorat query ResultSet kaa obj milega deserialized hokar Statement ke pas two method kyunki two tarike ki query selectQuery retrieval wala actionQuery me create update delete
//4 jab bhi selectQuery chali ResultSet ka obj mila next() se cursor next record pa move getString() se feild milegi 
//Database par four hi operation create update retrieve delete CURD  
import java.sql.*;
class Anki661
{
public static void main(String[] ss)
{
try
{
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","12345");
Statement s=c.createStatement();
ResultSet result1=s.executeQuery("select * from emp");//executeQuery() retrieval select query ke liye ResultSet degi
while(result1.next())
{
System.out.println(result1.getString("empid")+"="+result1.getString(2)+"="+result1.getString(3));
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