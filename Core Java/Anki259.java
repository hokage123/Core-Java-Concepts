class  Anki259
{
public static void main(String... s)
{
String S="I";
String S1=S.concat("am").concat("superbad").concat("boy");//yaha seven obj
System.out.println(S1);
String S2=S+"am"+"honey"+"Singh";//yaha five obj +operator ke through proper cmd chalta hai new StringBuffer().append(S).append("am").append("Superbad").append("boy").toString() 
System.out.println(S2);
}
}