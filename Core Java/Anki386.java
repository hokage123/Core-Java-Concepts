import java.io.CharArrayWriter;
import java.io.FileWriter;
import java.io.CharArrayReader;
import java.io.IOException;
class Anki386
{
public static void main(String n[])throws IOException
{
CharArrayWriter fw=new CharArrayWriter();
String S="india is a good country ssss";
char ch[]=S.toCharArray();
for(int i=0;i<ch.length;i++)
fw.write(ch[i]);
fw.writeTo(new FileWriter("temp.txt"));
CharArrayReader fr=new CharArrayReader(ch);
System.out.println(fw.toString());
char z[]=fw.toCharArray();
int i=0;
while((i=fr.read())!=-1)
System.out.println((char)i);
}
}