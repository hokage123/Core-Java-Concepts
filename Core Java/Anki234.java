class Anki234
{
int age;
void get(int age)throws AgeException
{
if(age<18)
{
throw new AgeException("invalid gc");
}
else
{
this.age=age;
}
}
public static void main(String... s)
{
Anki234 a=new Anki234();
try
{
a.get(10);
}
catch(AgeException e)
{
System.out.println(e);
}
}
}
class AgeException extends Exception
{
AgeException(String S)
{
super(S);
}
}