import static java.io.StreamTokenizer.TT_EOF;
import static java.io.StreamTokenizer.TT_NUMBER;
import static java.io.StreamTokenizer.TT_WORD;
import java.io.IOException;
import java.io.StreamTokenizer;
import java.io.StringReader;
class Anki392
{
public static void main(String... b)throws IOException
{
String Str="this is a test,200 which is simple 50";
StringReader sr=new StringReader(Str);
StreamTokenizer st=new StreamTokenizer(sr);
while(st.nextToken()!=TT_EOF)
{
switch(st.ttype)
{
case(TT_WORD):/*a word that has been read*/
System.out.println("String val"+st.sval);
break;
case(TT_NUMBER):/*a number that has been read*/
System.out.println("Number val"+st.nval);
break;
}
}
}
}