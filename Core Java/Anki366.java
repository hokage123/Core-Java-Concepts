import java.io.*;
class Anki366
{
public static void main(String... s)throws IOException
{
FileInputStream fr=new FileInputStream("lalu1.txt");
FileOutputStream fw=new FileOutputStream("lalu2.txt");
FileInputStream fm=new FileInputStream(new File("D:\\java codes\\lalu2.txt"));//FileOutputStream me jab tak string pass nhi karoge file create nhi
int i=0;
while((i=fr.read())!=-1)
System.out.println((char)i);//read data from buffer not from file
while((i=fm.read())!=-1)
System.out.println((char)i);
fr.close();
fm.close();
}
}