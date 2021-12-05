import java.awt.*;
import javax.swing.*;
class Anki300 extends JFrame
{
public static void main(String... s)
{
new Anki300();
}
public Anki300()
{
super("using html in JLabels");
Anki299.setMotifLookAndFeel();
addWindowListener(new ExitListener());
Container content=getContentPane();
Font font=new Font("serif",Font.PLAIN,30);
content.setFont(font);
String LabelText="<html><Font Color=RED>Red</Font>and"+"<html><Font Color=BLUE>Blue</Font>Text</html>";
JLabel ColoredLabel=new JLabel(LabelText);
ColoredLabel.setBorder(BorderFactory.createTitledBorder("Mixed Colors"));
content.add(ColoredLabel,BorderLayout.NORTH);
LabelText="<html><B>Bold</B>and<I>Italic</I>Text</html>";
JLabel BoldLabel=new JLabel(LabelText);
content.add(BoldLabel,BorderLayout.CENTER);
LabelText="<html>The Applied Physics Of laboratory in Division"
			+" of JU University"+
			"<P>"+"Major JHU division include"
			+"<LI>The Applied Physics laboratory"
			+"<LI>The Keringhen School of Art and Science";
			JLabel FancyLabel=new JLabel(LabelText);
			FancyLabel.setBorder(BorderFactory.createTitledBorder("Multi line html"));
			content.add(FancyLabel,BorderLayout.SOUTH);
			pack();
			setVisible(true);
			
			}
}