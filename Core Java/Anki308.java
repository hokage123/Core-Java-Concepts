import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.border.*;
public class Anki308 extends JFrame
{
public static void main(String... s)
{
new Anki308();
}
private JList sampleJList;
private JTextField valueField;
public Anki308()
{
super("creating a simple JList");
Anki299.setNativeLookAndFeel();
addWindowListener(new ExitListener());
Container content=getContentPane();
String[] entries={"Entry1","Entry2","Entry3","Entry4","Entry5","Entry6"};
sampleJList=new JList(entries);
sampleJList.setVisibleRowCount(3);
Font displayfont=new Font("serif",Font.BOLD,18);
sampleJList.setFont(displayfont);
sampleJList.addListSelectionListener(new ValueReporter());
JScrollPane listpane=new JScrollPane(sampleJList);
JPanel listpanel=new JPanel();
listpanel.setBackground(Color.white);
Border listpanelBorder=BorderFactory.createTitledBorder("sampleJList");
listpanel.setBorder(listpanelBorder);
listpanel.add(listpane);
content.add(listpanel,BorderLayout.NORTH);
JLabel valueLabel=new JLabel("Last Selection");
valueLabel.setFont(displayfont);
valueField=new JTextField("none",4);
valueField.setFont(displayfont);
JPanel valuePanel=new JPanel();
valuePanel.setBackground(Color.white);
Border valuePanelBorder=BorderFactory.createTitledBorder("JListSelection");
valueLabel.setBorder(valuePanelBorder);
valuePanel.add(valueLabel);
valuePanel.add(valueField);
content.add(valuePanel,BorderLayout.SOUTH);
pack();
setVisible(true);
}
private class ValueReporter implements ListSelectionListener
{
public void valueChanged(ListSelectionEvent e)
{
valueField.setText(sampleJList.getSelectedValue().toString());
}
}
}