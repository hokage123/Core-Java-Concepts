import java.io.FileReader;
import java.io.IOException;
class Anki385
{
public static void main(String[] fy)throws IOException
{
FileReader fr=new FileReader("ducat12.txt");
int i=0;
while((i=fr.read())!=-1)
System.out.print((char)i);
fr.close();
}
}