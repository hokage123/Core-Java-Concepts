//ArrayCopy
class Anki634
{
public static void main(String... s)
{
String[] names=new String[]{"A","B","C"};
String[] extended=new String[5];
extended[3]="D";
extended[4]="F";
System.arraycopy(names,0,extended,0,names.length);//arrayCopy() me 1st arg array pass jisse copy phir 2nd arg us array ke  kis index se copy krna start 3rd arg kis array me copy 4th 5th arg lowerbound UpperBound kis inndex se lekar kis index tak copy
for(String str:extended)
System.out.println(str);
}
}
