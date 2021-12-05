import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
class Anki414
{
public static void main(String... s)
{
Path p1=Paths.get("d:\\test");
try
{
Files.createFile(p1);
System.out.format("File %s create: %n",p1.toRealPath());
}
catch(FileAlreadyExistsException e)
{
System.out.format("file %s already exists %n",p1.normalize());
}
catch(NoSuchFileException e)
{
System.out.format("Directory %s does not exists %n",p1.normalize().getParent());
}
catch(IOException e)
{
e.printStackTrace();
}
}
}