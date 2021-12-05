import java.io.*;
class Anki375
{
public static void main(String... s)throws IOException
{
FileOutputStream fout=new FileOutputStream("chachi.txt");
PrintStream ps=new PrintStream(fout);
FileOutputStream fout1=new FileOutputStream("chacha.txt",true);
PrintStream ps1=new PrintStream(fout1);
System.out.println("before");
PrintStream ps4=System.out;
System.setOut(ps);
System.setErr(ps1);
System.out.println("chachi420");
System.out.println("chachi840");
System.err.println("chacha420");
System.err.println("chacha840");
//System.out=ps4;//humko allowed nahi hain out,err public final static setOut setErr ko allowed hain
System.setOut(ps1);
System.out.println("chachi240");
System.setOut(ps4);
ps4.println("after");
System.out.println("via/actual out");
}
}