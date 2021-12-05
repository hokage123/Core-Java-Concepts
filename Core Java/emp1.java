import java.io.*;
public class emp1 implements Serializable
{
//private static final long serialVersionUID = 77l;
String S;
int age;
emp1(int age,String S)
{
this.S=S;
this.age=age;
}
void show()
{
System.out.println(S+age);
}
}