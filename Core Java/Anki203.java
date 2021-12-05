class Anki203
{
static Anki203 z;
int x=20;
int y=30;
static void show()
{
Anki203 e=new Anki203();
display();
}
static void display()
{
Anki203 f=new Anki203();
}
public void finalize() throws Throwable
{
z=this;
System.out.println("javan Saheed") ;
}
public static void main(String... s)throws Exception
{
Anki203 d=new Anki203();
show();
//System.out.println(e);//error
//System.out.println(f);//error
System.gc();
}
}