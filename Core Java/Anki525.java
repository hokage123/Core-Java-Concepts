//ArrayToArrayList
import java.util.*;
class Anki525
{
public static void main(String... d)
{
//Array declarartion and initialization
String cityNames[]={"Agra","Mysore","Chandigarh","Bhopal"};
List<String> l=Arrays.asList(cityNames);//Arrays ka asList() method Array ko list me convert krke dega
//Array To ArrayList conversion
ArrayList<String> citylist=new ArrayList<String>(l);//phir list ko ArrayList me convert krne ke liye ArrayList(Collection c) chalaya
citylist.add("Newcity2");
citylist.add("Newcity3");
for(String str:citylist)
System.out.println(str);
}
}