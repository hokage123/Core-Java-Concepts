import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;
class Anki411
{
public static void main(String... s)
{
//Path p=Paths.get("D:\\java codes\\Anki1.java");
//Path p=Paths.get("D:\\java codes\\run.html");
Path p=Paths.get("D:\\java codes\\abc.txt");
try
{
String contentType=Files.probeContentType(p);
System.out.format("content type of %s is %s%n",p,contentType);
}
catch(IOException e)
{
	e.printStackTrace();
}
}
}