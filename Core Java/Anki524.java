//ArrayListToArray
import java.util.*;
class Anki524
{
public static void main(String... k)
{
ArrayList<String> arrlist=new ArrayList<String>();
arrlist.add("String1");
arrlist.add("String2");
arrlist.add("String3");
arrlist.add("String4");
//ArrayList to Array conversion
String array[]=new String[arrlist.size()];//size() se num of element capacity nahi ArrayList me capacity nikalne ke liye koi method nahi
for(int j=0;j<arrlist.size();j++)
array[j]=arrlist.get(j);
//display array elements
for(String str:array)
System.out.println(str);
}
}
/*ek collection me se obj four ways me ek ek krke nikal skte hai
1Iterator ke next se 
2 foreach loop se
3List ke get() method se
4 toArray() method se pehle array me convert phir for loop se nikal lo*/