import java.awt.*;
import javax.swing.*;
class swing1 
{
public static void main(String args[])
{
JFrame f=new JFrame("My Swing");
f.setSize(300,400);
JCheckBox ck=new JCheckBox("VISA");
ButtonGroup bg = new ButtonGroup();
JRadioButton r1=new JRadioButton("Male");
JRadioButton r2=new JRadioButton("Female");
bg.add(r1);
bg.add(r2);
String ls[] = {"Math", "Computer", "Physics", "Chemistry"};
JComboBox cb=new JComboBox(ls);
JButton b =new JButton("Register");
JPanel p=new JPanel();
Icon i=new ImageIcon("abc.png");
JScrollBar s=new JScrollBar();  
s.setBounds(1000,1000, 50,100);
JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 50, 25);

//creating awt combobox called choice box in awt
Choice c1=new Choice();
c1.addItem("Hirdesh");
c1.addItem("Rohit");
c1.addItem("Tarun");
c1.addItem("Varun");
b.setIcon(i);
f.add(p);
p.add(ck);
p.add(b); 
p.add(r1); 
p.add(r2); 
p.add(cb); 
p.add(c1);
p.add(s);
p.add(slider); 
f.setVisible(true);


}
}
