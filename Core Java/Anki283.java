import java.awt.*;
class Anki283
{
Frame f;
TextField tf;
Button b;
Anki283(String S)
{
f=new Frame(S);
tf=new TextField();
tf.setBounds(40,40,80,20);
f.add(tf);
b=new Button("ok");
b.setBounds(40,70,40,40);
f.add(b);
f.setLayout(null);
f.setSize(400,400);
f.setVisible(true);
}
public static void main(String... s)
{
new Anki283("");
}
}