//moving files
import static java.nio.file.StandardCopyOption.ATOMIC_MOVE;
import java.io.IOException;
import java.nio.file.AtomicMoveNotSupportedException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
class Anki413
{
public static void main(String... s)throws Exception 
{
Path source=Paths.get("d:\\menuswingp");
Path target=Paths.get("d:\\c codes\\see");
try
{
Path p=Files.move(source,target,ATOMIC_MOVE);
System.out.println(source+"has been moved"+p);
}
catch(NoSuchFileException e)
{
System.out.println("source/target does not exists");
}
catch(FileAlreadyExistsException e)
{
System.out.println("Atomic move is not supported move failed");
}
catch(IOException e)
{
e.printStackTrace();
}
}
}