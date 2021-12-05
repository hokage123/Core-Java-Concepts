import java.io.IOException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
class Anki415
{
public static void main(String... s)
{
Path p=Paths.get("D:\\ds");
try
{
//Files.delete(p);
boolean b=Files.deleteIfExists(p);
System.out.println(p+"="+b);
//System.out.println(p+"deleted Sucessfully");
}
catch(DirectoryNotEmptyException e)
{
System.out.println("Directory"+p+"is not empty");
}
catch(IOException e)
{
e.printStackTrace();
}
}	
}