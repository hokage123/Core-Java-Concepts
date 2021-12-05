import java.io.File;
class Anki403
{
public static void main(String... s)
{
File f=new File("D://assignment");
deleteFolder(f);
f.delete();
}
public static void deleteFolder(File f)
{
File[] files=f.listFiles();
for(File fi:files)
{
if(fi.isDirectory())
deleteFolder(fi);

fi.delete();
}
}
}