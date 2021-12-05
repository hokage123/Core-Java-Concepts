//DateFormatClass
//getInstance() and getDateInstance() me alag alag static const pass krke object milte jaate hai aur format krne ke liye un par format() chala chalakar date pass
import java.text.DateFormat;
import java.util.Date;
class Anki652
{
public static void main(String... s)
{
Date d1=new Date();
DateFormat[] dfa=new DateFormat[6];
dfa[0]=DateFormat.getInstance();
dfa[1]=DateFormat.getDateInstance();
dfa[2]=DateFormat.getDateInstance(DateFormat.SHORT);
dfa[3]=DateFormat.getDateInstance(DateFormat.MEDIUM);
dfa[4]=DateFormat.getDateInstance(DateFormat.LONG);
dfa[5]=DateFormat.getDateInstance(DateFormat.FULL);
for(int i=0;i<dfa.length;i++)
System.out.println(dfa[i].format(d1));
for(DateFormat df:dfa)
System.out.println(df.format(d1));
}
}