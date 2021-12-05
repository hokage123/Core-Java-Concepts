import java.io.*;
class Anki369
{
public static void main(String... s)
{
try(FileOutputStream fw=new FileOutputStream("lalu1.txt");FileInputStream fr=new FileInputStream("lalu1.txt"))
{
String S="india is good country in the world";
byte ch[]=S.getBytes();
for(int i=0;i<ch.length;i++)
fw.write(ch[i]);
System.out.println("file created sucessfully");
int i=0;
while((i=fr.read())!=-1)
System.out.println((char)i);
}
catch(Exception e)
{}
}
}