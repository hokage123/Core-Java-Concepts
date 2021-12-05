class Anki229
{
	public static void main(String... s)
	{
		try(Sam d=new Sam();Sam1 d1=new Sam1())
		{
			int x=10/0;
			d.show();
			d1.show1();
		}
		catch(ArithmeticException e)//try pura execute ho na ho AutoCloseable ka close method hamesa chalega try with se resources hamesa close honge
		{
			System.out.println(e);
		}
	}
}
class Sam implements AutoCloseable 
{
	void show()
	{
		System.out.println("show");
	}
	public void close()
	{
		System.out.println("close for Sam");
	}
}
class Sam1 implements AutoCloseable
{
	void show1()
	{
		System.out.println("show1");
	}
	public void close()
	{
		System.out.println("close for Sam1");
	}
}