class Anki204
{
	int x=5;
Anki203 a=new Anki203();
public static void main(String... s)
{
	Anki202 b=new Anki202();
Anki204 r=new Anki204();
System.out.println(r.x);
//System.out.println(a.x);//a needs r as a is indirect ref weak r is direct strong
System.out.println(r.a.x);
System.out.println(b.x);
} 
}