import java.io.File;
class Anki408
{
public static void main(String... s)
{
//change the dirPath value to list Files from the your directory
String dirPath="D:\\";
File dir=new File(dirPath);
File[] list=dir.listFiles();
for(int i=0;i<list.length;i++)
			{
			if(list[i].isFile())
			System.out.println(list[i].getPath()+"(file)");
			else if(list[i].isDirectory())
			System.out.println(list[i].getPath()+"(Directory)");
			}
}
}