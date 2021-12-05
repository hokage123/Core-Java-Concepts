import java.io.File;
class Anki405
{
public static void main(String... s)
{
File file=new File("d:\\java codes");
if(file.isDirectory())
{
String[] files=file.list();
if(files.length>0)
System.out.println("The"+file.getPath()+"is not empty!");
}
}
}