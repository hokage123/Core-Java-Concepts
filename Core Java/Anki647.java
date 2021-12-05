//setInt
import java.lang.reflect.Array;
class Anki647
{
public static void main(String... s)
{
int array[]=(int [])Array.newInstance(int.class,3);
int length=Array.getLength(array);
for(int i=0;i<length;i++)
{
int value=i;
Array.setInt(array,i,value);
}
for(int i:array)
System.out.println(i);
}
}