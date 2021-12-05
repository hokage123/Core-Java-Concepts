//Arrays class
//ArrayClone
class Anki633
{
public static void main(String... s)
{
int array1[]={1,2,3,4,5};
int[] clone=(int [])array1.clone();//array ki jo proxy class banti hai voh Serializable,Clonneable ko implement
for(int i:clone)
System.out.println(i);
}
}