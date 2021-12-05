import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
class Anki399
{
public static void main(String... i)
{
try
{
ZipFile zipFile=new ZipFile("test1.zip");
Enumeration enu=zipFile.entries();
while(enu.hasMoreElements())
{
ZipEntry zipEntry=(ZipEntry)enu.nextElement();
String name=zipEntry.getName();
System.out.println("name="+name);
//File file=new File(name);
File file=new File("D:\\"+name);
InputStream is=zipFile.getInputStream(zipEntry);
FileOutputStream fos=new FileOutputStream(file);
//FileOutputStream fos=new FileOutputStream(name);
int length;
while((length=is.read())!=-1)
fos.write(length);
is.close();
fos.close();
}
zipFile.close();
}
catch(IOException e)
{
e.printStackTrace();
}
}
}