import java.io.*;
class Anki365
{
public static void main(String... s)throws IOException
{
	int i;
FileOutputStream fw=new FileOutputStream("lalu.txt");
File fg=new File("D://java codes//lalu.txt");
String S="India is goj country";
byte ch[]=S.getBytes();//has to be converted in bytes
//fw.write(ch);
for( i=0;i<ch.length;i++)
 fw.write(ch[i]);
	fw.close();
 System.out.println("file created sucessfully");
 FileOutputStream f=new FileOutputStream("lalu1.txt",true);
File f1=new File("D://java codes//lalu1.txt");
String S1="India is sexoj country";
byte ch1[]=S1.getBytes();//has to be converted in bytes
//f.write(ch);
//f.write(ch1);
 for( i=0;i<ch.length;i++)
 f.write(ch[i]);
 for( i=0;i<ch1.length;i++)
 f.write(ch1[i]);
f.close();
 System.out.println("file 2 created sucessfully");
} 
}