import java.io.*;
class Anki388
{
public static void main(String... h)throws IOException
{
InputStreamReader ir=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(ir);
FileWriter fw=new FileWriter("abc11.txt");
BufferedWriter bw=new BufferedWriter(fw);
PrintWriter pw=new PrintWriter(fw);
String S="";
while(!S.equals("stop"))
{
S=br.readLine();
bw.write(S);
bw.write("");
//pw.println(S);
bw.flush();
}
br.close();
bw.close();
fw.close();
}
}