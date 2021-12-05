//@Deprecated and @SupressWarning
import java.lang.annotation.*;
class TestDeprecated
{
 @Deprecated
 static void display()//chalane par warning method Deprecated
 {
 System.out.println("display");
 }
}
class Anki483
{
public static void main(String... o)
{
new Anki483().doSomeTestNow();
}
@SuppressWarnings({"checked","deprecation"})//supress Deprecation warnings
public void doSomeTestNow()
{
TestDeprecated.display();
}
}