import java.io.IOException;
class Anki232
{
int div()throws ArithmeticException,IOException//yeh batata hai ArithmeticException aa raha hai try catch lagao 
{
int x=System.in.read();
int y=System.in.read();
return x/y;
}
}
class Anki232a
{
public static void main(String... s)throws IOException//throws ke wajah se checked Exception bhi calling chain me  
{
//int a=new java.util.Scanner(System.in).nextInt();
//int b=new java.util.Scanner(System.in).nextInt();
Anki232 f=new Anki232();
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