import java.io.File;
import java.io.FilenameFilter;
class ExtensionFilter implements FilenameFilter
{
String ext;
int i=1;
public ExtensionFilter(String ext)
{
this.ext="."+ext;
}
public boolean accept(File dir,String name)
{
//System.out.println(i++);
return name.endsWith(ext);
}
}
class Anki406
{
public static void main(String... s)
{
String dirname="D:\\java codes";
File f1=new File(dirname);
FilenameFilter only=new ExtensionFilter("java");
String S[]=f1.list(only);
for(int i=0;i<S.length;i++)
System.out.println(S[i]);
}
}