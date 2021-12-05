class Anki129
{  
public static void main(String... s)
{
String cp=System.getproperty(java.Class.Path);
System.out.println(cp);
System.setproperty("java.Class.Path","d:\\f1");
String cp1=System.getproperty(Java.Class.Path);
System.out.println(cp1);
}
}