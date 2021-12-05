class Anki199
{
int x=10;
int y=30;
static void show()
{
Anki199 e=new Anki199();
display();
}
static void display()
{
Anki199 f=new Anki199();
}
public void finalize() throws Throwable
{
System.out.println("javan Saheed") ;
}
public static void main(String... s)
{
Anki199 d=new Anki199();
show();
//System.out.println(e);//error
//System.out.println(f);//error
System.gc();
}
}