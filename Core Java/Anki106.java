interface Anki106
{
void show();
}
class Iwabe implements Anki106
{
public void show()
{
System.out.println("show");
}
void display()
{
System.out.println("display");
}
public static void main(String... s)
{
Anki106 i=new Iwabe();
//i.display();
}
}