class Anki255
{
public static void main(String... s)
{
String S1="hickory Dickory dock";
char ch[]=S1.toCharArray();//string ko char type array me change
byte b[]=S1.getBytes();//string ko byte type ke array me change
for(int i=0;i<S1.length();i++)
System.out.print(ch[i]+"\t");
System.out.println(" ");
for(int i=0;i<S1.length();i++)
System.out.print(b[i]+"\t");
System.out.println(" ");
for(int i=0;i<S1.length();i++)
{
char c=S1.charAt(i);//har index ki val char by char acess krne ke liye char charAt(int index)
System.out.print(c+"\t");
}
System.out.println(S1.toUpperCase());//purey String koo uppercase me change kr ke return actual obj me koi change nhi copy create kr ke usme change kr ke return
System.out.println(S1.toLowerCase());//purey String koo lowercase me change kr ke return actual obj me koi change nhi copy create kr ke usme change kr ke return
}
}