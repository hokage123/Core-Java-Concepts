//DoubleSize
class Anki643
{
public static void main(String... s)
{
int array1[]={1,2,3,4,5};
int array2[]={1,2,3,4,5,6,7,8};
System.out.println("original size"+array1.length);
array1=doubleArray(array1);
System.out.println("original size"+array1.length);
System.out.println("original size"+array2.length);
array2=doubleArray(array2);
System.out.println("original size"+array2.length);
}
static int[] doubleArray(int original[])
{
int length=original.length;
int newArray[]=new int[length*2];
System.arraycopy(original,0,newArray,0,length);
return newArray;
}
}