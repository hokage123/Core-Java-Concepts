//description about my lambda Expression
class Anki499
{
public static void main(String... s)
{
Anki499 e=new Anki499();
//with type declaration
MathOperation addition=(int a,int b)->a+b;
//without type declaration
MathOperation subtraction=(a,b)->a-b;
//with return statement and without curly braces
MathOperation multiplication=(int a,int b)->{return a*b;};//return statement also can be written lambda Expression is flexible 
//without return statement without curly braces
MathOperation division=(int a,int b)->a/b;
System.out.println("10+5="+e.operate(10,5,addition));
System.out.println("10-5="+e.operate(10,5,subtraction)); 
System.out.println("10*5="+e.operate(10,5,multiplication));
System.out.println("10/5="+e.operate(10,5,division));
GreetingService greetService1=message->System.out.println("Hello"+message);
GreetingService greetService2=(message)->{
											System.out.println("Hello"+message);
											System.out.println("Hey"+message);
											};//for more than one line curly braces required

greetService1.sayMessage("Mahesh");
greetService2.sayMessage("Suresh");	
}

private int operate(int a,int b,MathOperation mathOperation)
{
return mathOperation.operation(a,b);
}
}
interface MathOperation
{
int operation(int a,int b);
}
interface GreetingService
{
void sayMessage(String message);
}//lambda expression are only use for interface having single functionor we can say that lambda expression can be used to define a interface with single method