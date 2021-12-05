//ArrayCopy1
class Anki635
{
public static void main(String... s)
{
int[] intArray=new int[]{1,2,3,4,5,6,7,8,9,0};
int[] arrayCopy=new int[intArray.length];
//System.arraycopy(intArray,0,arrayCopy,0,arrayCopy.length);
System.arraycopy(intArray,2,arrayCopy,0,4);
/*for(int i=0;i<arrayCopy.length;i++)
System.out.println(arrayCopy[i]);
*/
for(int i=0;i<4;i++)
System.out.println(arrayCopy[i]);
}
}