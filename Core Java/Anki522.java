//ArrayListSerialization
import java.util.ArrayList;
import java.io.*;
class Anki522
{
public static void main(String... o)
{
ArrayList<String> al=new ArrayList<>();
al.add("Hello");
al.add("Hi");
al.add("Howdy");
try
{
FileOutputStream fos=new FileOutputStream("myfile");
ObjectOutputStream oos=new ObjectOutputStream(fos);
oos.writeObject(al);
oos.close();
fos.close();
System.out.println("after deserialization");
FileInputStream fin=new FileInputStream("myfile");
ObjectInputStream oin=new ObjectInputStream(fin);
ArrayList al1=(ArrayList)oin.readObject();
System.out.println(al1);
}
catch(Exception e)
{
e.printStackTrace();
}
}
}
//bahut saare obj serialized krne hai sab par writeObject() chalao yaa ArrayList ke obj me saare obj daalo ArrayList ko serialized obj andar waale apne aap serialized ek condtn par ki andar waale obj ki classes ne Serializable ko implement kiya ho