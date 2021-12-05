//Runtime and Process class
class Anki447
{
public static void main(String... s)
{
Runtime rt=Runtime.getRuntime();
try
{
rt.exec("notepad.exe");//jis .exe ka naam exec() me paas use execute
Process error=rt.exec("C:\\Program Files\\Java\\Java\\jdk-9\\bin\\javac.exe -d Anki446.java");

}
catch(Exception e)
{
System.out.println(e);
}
System.out.println("hello");
}
}