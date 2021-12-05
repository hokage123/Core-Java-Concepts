//lamda scope test
import java.util.function.Consumer;
class Anki500
{
public int x=9;//yahan par inner class outer class ka same var ek  data shadowing ki tarah 
class FirstLevel
{
public int x=3;
void methodInFirstLevel(int x)
{
Consumer<Integer> myConsumer=(y)->
									{
									System.out.println("x="+x);//local print
									System.out.println("y="+y);//local print
									System.out.println("this.x="+this.x);//jiska obj uska x yani inner class ka
									System.out.println("Anki500.this.x="+Anki500.this.x);//class level ka x yani outer class ka x
									};
									myConsumer.accept(x);
}
}
public static void main(String... s)
{
Anki500 st=new Anki500();
Anki500.FirstLevel f1=st.new FirstLevel();
f1.methodInFirstLevel(23);
}
}