//Compiletest
import javax.tools.*;
class Anki452
{
public static void main(String[] r)
{
JavaCompiler comp=ToolProvider.getSystemJavaCompiler();//yeh javac tool hi toh hai getSystemJavaCompiler()se JavaCompiler ka obj mila
int i=comp.run(System.in,System.out,System.err,"A.java");//JavaCompiler ke run me printStream ke two obj  InputStream ka ek obj
System.out.println(i);
}
}
class A
{
	int x;
	public static void main(String[] k)
	{}
	
}