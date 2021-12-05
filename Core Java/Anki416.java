import java.io.IOException;
import java.util.Enumeration;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
class Anki416
{
public static void main(String... s)throws IOException
{
JarFile jarFile=new JarFile("D://java codes//s1.jar");
Enumeration e=jarFile.entries();
while(e.hasMoreElements())
process(e.nextElement());
jarFile.close();
} 
private static void process(Object obj)
{
JarEntry entry=(JarEntry)obj;
String name=entry.getName();
long size=entry.getSize();
long compressedSize=entry.getCompressedSize();
System.out.println(name+"\t"+size+"\t"+compressedSize);
}
}