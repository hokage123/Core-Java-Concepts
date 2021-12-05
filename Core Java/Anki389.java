import java.io.*;
class Anki389
{
public static void main(String... Sr)throws IOException
{
FileReader fr=new FileReader("abc11.txt");
BufferedReader br=new BufferedReader(fr);
String S="";
while(S!=null)
{
S=br.readLine();
if(S!=null)
System.out.println(S);
}
}
}