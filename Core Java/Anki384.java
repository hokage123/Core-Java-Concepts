import java.io.*;
class Anki384
{
public static void main(String... s)throws IOException
{
FileWriter fw=new FileWriter("ducat11.txt");
FileWriter fw1=new FileWriter("ducat12.txt",true);
FileWriter fw2=new FileWriter(new File("d://assignment//ducat13.txt"),true);
String S="india is a good country sssshoiui";
String S1="india has some guts gou";
char ch[]=S.toCharArray();
char ch1[]=S1.toCharArray();
for(int i=0;i<ch.length;i++)
{
fw.write(ch[i]);
fw1.write(ch[i]);
fw2.write(ch[i]);
}
/*fw.write(ch);
fw1.write(ch);
fw2.write(ch);*/
/*fw.write(S);
fw1.write(S);
fw2.write(S);*/
for(int i=0;i<ch1.length;i++)
{
fw.write(ch1[i]);
fw1.write(ch1[i]);
fw2.write(ch1[i]);
}
/*fw.write(ch1);
fw1.write(ch1);
fw2.write(ch1);*/
/*fw.write(S1);
fw1.write(S1);
fw2.write(S1);*/
fw2.close();
fw1.close();
fw.close();

}
}