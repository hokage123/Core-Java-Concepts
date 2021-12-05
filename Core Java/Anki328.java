class Anki328
{
public static void main(String... s)
{
Thread t=Thread.currentThread();
System.out.println(t.getName());
t.setName("main gandu");
System.out.println(t.getName());
}
}