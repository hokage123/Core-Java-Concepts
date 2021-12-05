import java.io.*;
class Anki391
{
public static void main(String... l)throws IOException
{
	int count=0,token=0;
FileInputStream fin=new FileInputStream("abc11.txt");
InputStreamReader ir=new InputStreamReader(fin);
StreamTokenizer st=new StreamTokenizer(ir);
st.eolIsSignificant(true);
st.wordChars(33,225);
st.whitespaceChars(0,32);
while(true)
{
if(token==StreamTokenizer.TT_EOF)
break;
token=st.nextToken();
if(token==StreamTokenizer.TT_NUMBER)
System.out.println(st.nval+"number");
if(token==StreamTokenizer.TT_WORD)
System.out.println(st.sval+"word");
count++;
}
System.out.println("num of word in line"+--count);
}
}