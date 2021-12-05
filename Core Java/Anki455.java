//Vargs
class Anki455
{
void show(char ch,int... x)//there would be one vargs and it would be last argument
{
	System.out.println(ch);
for(int i:x)
System.out.println(i);
for(int j=0;j<x.length;j++)
System.out.println(x[j]);
}
public static void main(String[] h)
{
new Anki455().show('a',10,19,10,23);
}
}