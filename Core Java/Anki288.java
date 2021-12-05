import java.awt.*;
class Anki288
{Frame f;
TextField tf;
String Sl[]={"CE","C","$","%","7","8","9","*","4","5","6","-","1","2","3","+","#","0",".","="};
Button b[][]=new Button[5][4];
Anki288(String S)
{int m=0;
f=new Frame(S);
tf=new TextField();
tf.setBounds(40,40,300,90);
f.add(tf);
for(int i=0;i<b.length;i++)
for(int j=0;j<b[i].length;j++){b[i][j]=new Button(Sl[m++]);
b[i][j].setBounds(j*90,i*90+140,90,90);
f.add(b[i][j]);}
f.setLayout(null);
f.setSize(370,600);
f.setVisible(true);}
public static void main(String... s){new Anki288("CALCI");}}