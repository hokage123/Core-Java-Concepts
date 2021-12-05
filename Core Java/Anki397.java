import java.io.*;
class Anki397
{
public static void main(String... s)throws IOException
{
Console cs=System.console();
if(cs!=null)
System.out.println("console is available");
System.out.println("enter the line");
String S1=cs.readLine();
System.out.println(S1);
String S2=cs.readLine("enter the name(%d,Chars)",5);
System.out.println(S2);
char ch[]=cs.readPassword();
char ch1[]=cs.readPassword("Enter the password(%d,Chars):",5);
System.out.println(new String(ch));
System.out.println(new String(ch1));
Reader r=cs.reader();
int x=r.read();
System.out.println(x);
PrintWriter pw=cs.writer();
pw.println("console via PrintWriter");
}
}