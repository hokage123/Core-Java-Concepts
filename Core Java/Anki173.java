class Anki173 implements Anki174
{
public static void main(String... s)
{
Anki173 a=new Anki173();
a.xyz();
z.show();
Jalebi j=new Jalebi();
j.display();
}
}
interface Anki174
{
default void xyz()
{
class Jalebi
{
void display()
{
System.out.println("local class in interface");
}
}
Jalebi j=new Jalebi();
j.display();
}
Anki175 z=new Anki175()
			{
			public void show()
			{
			System.out.println("Anonymous");
			}
			};
			class Jalebi
			{
			void display()
			{
			System.out.println("Static nested class in interface");
			}
			}
}
			class Hanuman extends Anki174.Jalebi
			{
			public static void main(String... s)
			{
			new Hanuman().display();
			}
			}
			interface Anki175
			{
			void show();
			}