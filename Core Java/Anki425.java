//Url Reader
import java.net.*;
import java.io.*;
class Anki425
{
public static void main(String... s)throws Exception
{
URL google=new URL("http://www.google.com");
BufferedReader in=new BufferedReader(new InputStreamReader(google.openStream()));
String inputLine;
while((inputLine=in.readLine())!=null)
System.out.println(inputLine);
in.close();
}
}