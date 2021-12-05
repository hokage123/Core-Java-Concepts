import java.io.IOException;
class Anki231
{
int div()throws ArithmeticException,IOException//yeh batata hai ArithmeticException aa raha hai try catch lagao 
{
int x=System.in.read();
int y=System.in.read();
return x/y;
}
}
class Anki231a
{
public static void main(String... s)
{
//int a=new java.util.Scanner(System.in).nextInt();
//int b=new java.util.Scanner(System.in).nextInt();
Anki231 f=new Anki231();
try
{
int z=f.div();
}
catch(IOException e)
{
	System.out.println(e);
}
catch(ArithmeticException e)
{
	System.out.println(e);
}
}
}
