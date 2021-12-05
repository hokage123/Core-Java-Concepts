import java.awt.*;
class Anki286
{
Frame f;
TextField tf;
Label l;
Button b;
Anki286(String S)
{
f=new Frame(S);
l=new Label("enter the num");
l.setBounds(40,40,80,20);
f.add(l);
tf=new TextField();
tf.setBounds(40,70,80,20);
f.add(tf);
b=new Button("ok");
b.setBounds(40,100,40,40);
f.add(b);
f.setLayout(null);
f.setSize(400,400);
f.setVisible(true);
}
public static void main(String... s)
{
new Anki286("first frame");
}
}