import java.io.IOException;
import java.util.StringTokenizer;
class Anki393
{
public static void main(String[] we)throws IOException
{
String S="Country=India;Capital=Delhi;Country=Japan;Capital=Tokyo";
StringTokenizer st=new StringTokenizer(S,";=");
while(st.hasMoreTokens())
System.out.println(st.nextToken());
}
}