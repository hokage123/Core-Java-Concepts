class Anki233
{
void show()
{
int x=10/0;
}
void display()
{
show();
}
void xyz()
{
display();
}
public static void main(String... s)
{
Anki233 u=new Anki233();
//u.xyz();// jvm ki default exception class me catch jo ter minate kar degi
try
{
u.xyz();
}
catch(ArithmeticException e)
{
	System.out.println(e);
e.printStackTrace();
}
}
}