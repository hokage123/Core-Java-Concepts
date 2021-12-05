import java.io.*;
class Anki407
{
public static void main(String... s)
{
String dirPath="D:\\java codes";
File dir=new File(dirPath);
FileFilter filter=new FileFilter()
					{
					public boolean accept(File f)
					{
					if(f.isFile()||f.isDirectory())
					{
					String fileName=f.getName().toLowerCase();
					if(fileName.endsWith(".txt"));
					return true;
					}
					return false;
					}
					};
			File[] list=dir.listFiles(filter);
			for(int i=0;i<list.length;i++)
			{
			if(list[i].isFile())
			System.out.println(list[i].getPath()+"(file)");
			else if(list[i].isDirectory())
			System.out.println(list[i].getPath()+"(Directory)");
			}
}
}