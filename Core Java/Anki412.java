import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.DirectoryNotEmptyException;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;
import static java.nio.file.StandardCopyOption.COPY_ATTRIBUTES;
class Anki412
{
public static void main(String... s)
{
Path source=Paths.get("d:\\c codes\\5digi.c");//agar pehle se target naam ki file hain to REPLACE_EXISTING constant ke through replace COPY_ATTRIBUTES se Attribute bhi files ke sath copy hokar jaati hain 
Path target=Paths.get("d:\\areaellipse.cpp");
try
{
Path p=Files.copy(source,target,REPLACE_EXISTING,COPY_ATTRIBUTES);
System.out.println(source+"has been copied"+p);
}
catch(FileAlreadyExistsException e)
{
System.out.println(target+"already exists");
}
catch(DirectoryNotEmptyException e)
{
System.out.println(target+"is not empty");
}
catch(IOException e)
{
e.printStackTrace();
}
}
}