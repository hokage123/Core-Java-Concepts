class Anki256
{
public static void main(String... s)
{
String S1="   Sunny toSunny leone  ";
System.out.println(S1.length());
String S=S1.trim();//trim function puriy leading and trailing space hatata hai
System.out.println(S1);
String S2=S.substring(10);//jo index num as a arg pass uske age ki sari string print 
System.out.println(S2);
 S2=S.substring(2,9);//substring overloaded toh lower upper index dono pass kr skte hai
System.out.println(S2);
int z=S.indexOf('S');//left to right char ko string me check hai toh index num vrna -1
System.out.println(z);
z=S.indexOf('i');
System.out.println(z);
z=S.indexOf('S',7);//ab jo index pass vaha se check
System.out.println(z);
z=S.indexOf("Sunny");//left to right string ko string me check hai toh string ke first char ka index num vrna -1
System.out.println(z);
z=S.indexOf("unny");
System.out.println(z);
z=S.indexOf("Sunny",7);//ab jo index pass vaha se check
System.out.println(z);
z=S.lastIndexOf('S');//right to left char ko string me check hai toh index num vrna -1
System.out.println(z);
z=S.lastIndexOf('i');
System.out.println(z);
z=S.lastIndexOf('S',7);//ab 7 ke pehle ke index check
System.out.println(z);
z=S.lastIndexOf("Sunny");//right to left String ko string me check hai toh first index num vrna -1
System.out.println(z);
z=S.lastIndexOf("unny");
System.out.println(z);
z=S.lastIndexOf("Sunny",7);//ab 7 ke pehle ke index check
System.out.println(z);
String S3=String.valueOf(10);//String class ka static function jo kisi ko bhi String me badlne ki taquat rkta hai
System.out.println(S3);
}
}