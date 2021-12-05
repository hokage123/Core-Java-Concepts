class Anki230
{
int div(int x,int y)throws ArithmeticException//yeh batata hai ArithmeticException aa raha hai try catch lagao 
{
return x/y;
}
}
class Anki230a
{
public static void main(String... s)
{
int a=new java.util.Scanner(System.in).nextInt();
int b=new java.util.Scanner(System.in).nextInt();
Anki230 f=new Anki230();
try
{
int z=f.div(a,b);
}
catch(ArithmeticException e)
{
	System.out.println(e);
}
}
}