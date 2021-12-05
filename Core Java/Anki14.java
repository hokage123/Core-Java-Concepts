class Anki14
{
void show()
{
System.out.println("void");
}
void show(int x)
{
System.out.println("int");
System.out.println(x);
} 
void show(int x,long l)
{
System.out.println("int and long");
System.out.println(x);
System.out.println(l);
}
void show(int x,long l,char c)
{
System.out.println("int and long and char");
System.out.println(x);
System.out.println(l);
System.out.println(c);
}
public static void main(String... s)
{
Anki14 e2=new Anki14();
e2.show();
e2.show(10);
e2.show(10,10);
e2.show('a','b','c');
}
}