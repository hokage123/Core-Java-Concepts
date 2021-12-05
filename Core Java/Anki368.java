import java.io.*;
class Anki368
{
public static void main(String... s)throws IOException
{
ByteArrayOutputStream fw=new ByteArrayOutputStream();
String S="India is agood country haan naa mererreyaar";
byte ch[]=S.getBytes();
for(int i=0;i<ch.length;i++)
fw.write(ch[i]);
fw.writeTo(new FileOutputStream("rabari11.txt"));
fw.writeTo(new FileOutputStream("rabari12.txt"));
System.out.println(fw.toString());
byte z[]=fw.toByteArray();
ByteArrayInputStream fr=new ByteArrayInputStream(z);
int i=0;
while((i=fr.read())!=-1)
System.out.println((char)i);
}
}