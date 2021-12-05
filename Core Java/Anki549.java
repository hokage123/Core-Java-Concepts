//MyVectorArrayCopy
import java.util.Vector;
class Anki549
{
public static void main(String... c)
{
Vector<String> vct=new Vector<>();
vct.add("First");
vct.add("Second");
vct.add("Third");
vct.add("Fourth");
System.out.println("Actual Vector:"+vct);
String[] copyArr=new String[vct.size()];
vct.copyInto(copyArr);//yahan toArray() ke saath copyInto() bhi used jo array isme pass usme saara content copy
System.out.println("copied Array Content");
for(String str:copyArr)
System.out.println(str);
}
}