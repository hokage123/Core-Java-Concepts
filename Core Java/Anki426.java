//File Transfer
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.net.*;
class Anki426 implements ActionListener
{
JFrame jf;
JButton jb1,jb2;
TextField tf;
JFileChooser jfc;
Socket s;
DataInputStream din;
DataOutputStream dout,dout1;
String s1="";
String s2="";
File f; 
Anki426()
{
jf=new JFrame("FileTransfer");
jf.setSize(400,400);
Container c=jf.getContentPane();
c.setBackground(Color.red);
jf.setLayout(null);
jb1=new JButton("Choose File");
jb2=new JButton("send");
jb1.setBounds(30,50,100,50);
jb2.setBounds(30,120,100,50);
jf.add(jb1);
jf.add(jb2);
tf=new TextField();
tf.setEditable(false);
tf.setBackground(Color.white);
tf.setBounds(150,50,140,50);
jf.add(tf);
jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
jfc=new JFileChooser();
jf.setVisible(true);
jb1.addActionListener(this);
jb2.addActionListener(this);
}
public void FileTransfer(String s1)
{
try
{
dout1.writeUTF(s1);
dout1.flush();
s2=f.getAbsolutePath();
BufferedReader br=new BufferedReader(new FileReader(s2));
String s3="";
do
{
s3=br.readLine();
if(s3!=null)
{
dout.writeUTF(s3);
dout.flush();
}
}
while(s3!=null);
}
catch(Exception f)
{
System.out.println(f+"jjjj");
}
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==jb1)
{
int x=jfc.showOpenDialog(null);
if(x==JFileChooser.APPROVE_OPTION)
{
f=jfc.getSelectedFile();
String path=f.getPath();
s1=f.getName();
tf.setText(path+"//"+s1);
}
}
if(e.getSource()==jb2)
{
try
{
//s1=tf.getText();
s=new Socket("Localhost",10);
//s=new Socket("192.168.201.3",10);
dout1=new DataOutputStream(s.getOutputStream());
dout=new DataOutputStream(s.getOutputStream());
}
catch(Exception E)
{
System.out.println("send  Button"+E);
}
FileTransfer(s1);
}
}
public static void main(String... o)
{
Anki426 ft=new Anki426();
}
}