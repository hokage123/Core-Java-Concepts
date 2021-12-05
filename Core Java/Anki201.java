class Anki201
{
int x=10;
int y=30;
static void show()
{
Anki201 e=new Anki201();
display();
}
static void display()
{
Anki201 f=new Anki201();
}
public void finalize() throws Throwable
{
System.out.println("javan Saheed") ;
}
public static void main(String... s)throws Exception
{
Anki201 d=new Anki201();
show();
//System.out.println(e);//error
//System.out.println(f);//error
for(int i=0;i<=2000;i++)
{ 
System.gc();
Thread.sleep(10000);//thread stops for 20000ms
}
}
}