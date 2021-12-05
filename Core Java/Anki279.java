class Anki279
{
public static void main(String... s)
{
StringBuffer sb=new StringBuffer();
//StringBuffer sb=new StringBuffer(20);
//StringBuffer sb=new StringBuffer("ducat");
System.out.println(sb.length());
System.out.println(sb.capacity());
StringBuffer sb1=sb.append("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
System.out.println(sb.length());
System.out.println(sb.capacity());
sb.append("9");
System.out.println("after second append");
System.out.println(sb.length());
System.out.println(sb.capacity());
}
}