class Anki262
{
public static void main(String... s)
{
String S1="Hello";
String S2=new String("Hello");
int z=S1.compareTo(S2);
System.out.println(z);
S1="Pello";
z=S1.compareTo(S2);//comparable naam ke interface ko String class implement kr rkha hai jiska compareTo method hai jo char by char compare agar equal 0 nhi toh s1 bada +ve s2 bada -ve
System.out.println(z);
S1="Bello";
z=S1.compareTo(S2);
System.out.println(z);
S1="Hello";
S2=new String("hello");
z=S1.compareToIgnoreCase(S2);
System.out.println(z);
}
}