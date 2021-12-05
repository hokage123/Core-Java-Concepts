class Anki200
{
int x=10;
int y=30;
static void show()
{
Anki200 e=new Anki200();
display();
}
static void display()
{
Anki200 f=new Anki200();
}
public void finalize() throws Throwable
{
System.out.println("javan Saheed") ;
}
public static void main(String... s)
{
Anki200 d=new Anki200();
show();
//System.out.println(e);//error
//System.out.println(f);//error
for(int i=0;i<=2000;i++) 
System.gc();
}
}