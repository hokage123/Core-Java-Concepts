//T datatype bounded ya Number se Replace yaa uske Child se
class Stats<T extends Number>
{
T[] num;
Stats(T[] o)
{
num=o;
}
double average()
{
double sum=0.0;
for(int i=0;i<num.length;i++)
sum+=num[i].doubleValue();
return sum/num.length;
}
}
class Anki475
{
public static void main(String... k)
{
Integer inums[]={1,2,3,4,5};
Stats<Integer> iOb=new Stats<Integer>(inums);
double v=iOb.average();
System.out.println("iOb average is"+v);
Double dnums[]={1.1,2.2,3.3,4.4,5.5,6.6};
Stats<Double> dOb=new Stats<>(dnums);
double w=dOb.average();
System.out.println("dOb average is"+w);
//String snums[]={"aa","bb","cc"};
//Stats<String> sOb=new Stats<String>(snums);//String number kaa child nahi
//Character cnums[]={'a','b','c'};
//Stats<Character> cOb=new Stats<>(cnums);//wrapper classes me Character ko chodke sab Number ke child
}
}