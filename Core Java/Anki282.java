import java.awt.*;
class Anki282
{
Frame f;
Anki282(String S)
{
f=new Frame(S);
f.setSize(400,400);
f.setVisible(true);
}
public static void main(String... s)
{
new Anki282("first Frame");
new Anki282("second Frame");
}
}