//ArraySort
import java.util.Arrays;
class Anki638
{
public static void main(String... s)
{
int[] intArray=new int[]{4,5,9,0,3,5,6,2};
Arrays.sort(intArray);//Arrays ke sort me jo bhi array pass usse andar hi andar sort krke de deta hai 
for(int i=0;i<intArray.length;i++)
System.out.println(intArray[i]);
String[] stringArray=new String[]{"D","E","A","C","B"};
Arrays.sort(stringArray);
for(int i=0;i<stringArray.length;i++)
System.out.println(stringArray[i]);
}
}