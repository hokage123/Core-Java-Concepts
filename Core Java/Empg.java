import java.io.*;
class Empg
{
	
String name;
String sal;
public static void main(String args[])throws IOException
{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
Empg r1=new Empg();	
r1.name=br.readLine();
r1.sal=br.readLine();
System.out.println(r1.name);
System.out.println(Integer.parseInt(r1.sal));
}
}