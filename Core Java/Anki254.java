class Anki254
{
public static void main(String... s)
{
String S1=new String("Hello");//this cons is used to create a copy of heap obj via intern method agar pehle se vahi ref return 
String S2=S1.intern();
String S3=new String("Hello");
String S4=S3.intern();
if(S2==S4)//pool me ek hi heap me lakh bana do
{
System.out.println("Same");
}
char ch[]={'d','a','r','l','i','n','g'};
String S=new String(ch);//yeh cons char type ke array ko string me change krta hai String(char ch[])
System.out.println(S);
S=new String(ch,2,4);//position bhi pass kr skte hai
System.out.println(S);
byte b[]={65,67,89,95,102};
String S5=new String(b);//yeh cons byte type ke array ko string me change krta hai String(byte b[])
System.out.println(S5);
S5=new String(b,2,3);//position bhi pass kr skte hai
System.out.println(S5);
}
}