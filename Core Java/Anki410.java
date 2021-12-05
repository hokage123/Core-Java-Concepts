import java.nio.file.Paths;
import java.nio.file.Path;
class Anki410
{
public static void main(String... s)
{
Path p1=Paths.get("d:\\java codes");//path from the root or drive is Absolute Or path local is relative
printDetails(p1);
}
public static void printDetails(Path p)
{
System.out.println("Details for path"+p);
int count=p.getNameCount();
System.out.println("NameCount"+count);
for(int i=0;i<count;i++)
{
Path name=p.getName(i);
System.out.println("Name at index"+i+"is"+name);
}
Path parent=p.getParent();
Path root=p.getRoot();
Path fileName=p.getFileName();
System.out.println("parent"+parent+"Root"+root+",FileName:"+fileName);
System.out.println("Absolute path="+p.isAbsolute());
}
}