import java.awt.*;
class Anki287
{
Frame f;
TextField tf;
Label l;
Button b;
Anki287(String S)
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
Toolkit t=f.getToolkit();
Dimension ScreenSize=t.getScreenSize();
int width=ScreenSize.width*8/10;
int height=ScreenSize.height*8/10;
//f.setBounds(width/8,height/8,width,height);
f.setBounds(400,200,600,400);
f.setLayout(null);
f.setSize(400,400);
f.setVisible(true);
}
public static void main(String... s)
{
new Anki287("first frame");
}
}