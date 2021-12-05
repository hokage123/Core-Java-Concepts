import java.io.File;
class Anki400
{
public static void main(String... o)
{
File[] roots=File.listRoots();
long l=1024*1024*1024;
for(int i=0;i<roots.length;i++)
{
System.out.println(roots[i]);
System.out.println("Free Space="+roots[i].getFreeSpace()/l);
System.out.println("usable="+roots[i].getUsableSpace()/l);
System.out.println("Total Space="+roots[i].getTotalSpace()/l);
System.out.println();
}
}
}