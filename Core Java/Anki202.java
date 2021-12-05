class Anki202
{
int x=20;
int y=30;
static void show()
{
Anki202 e=new Anki202();
display();
}
static void display()
{
Anki202 f=new Anki202();
}
public void finalize() throws Throwable
{
System.out.println("javan Saheed") ;
}
public static void main(String... s)throws Exception
{
Anki202 d=new Anki202();
show();
//System.out.println(e);//error
//System.out.println(f);//error
for(int i=0;i<=2000;i++)
{ 
new Anki200();
}
System.gc();
}
}