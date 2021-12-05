//ArrayCopy2
class Anki636
{
public static void main(String... s)
{
String[] letters={"A","I","U","E","O"};
String[] results=new String[3];
System.arraycopy(letters,0,results,0,3);
for(int i=0;i<results.length;i++)
System.out.println("results="+results[i]);
}
}