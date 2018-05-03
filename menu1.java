import java.awt.*;
import javax.swing.*;
class menu1
{
menu1()
{
JFrame f=new JFrame("My Notepad");
f.setSize(400,450);
JMenuBar mb=new JMenuBar();
JMenu m1, m2,m3;
JMenuItem i1,i2,i3,i4;
m1=new JMenu("File");
m2=new JMenu("Edit");
m3=new JMenu("Format");

i1=new JMenuItem("Open");
i2=new JMenuItem("Save");
i3=new JMenuItem("Undo");
i4=new JMenuItem("Font");
// set menubar at default position
f.setJMenuBar(mb);
// put ALL MENUS in menubar
mb.add(m1);
mb.add(m2);
mb.add(m3);

// now put all menu items to their respective menus

m1.add(i1);
m1.addSeparator();
m1.add(i2);
m2.add(i3);
m3.add(i4);

f.show();
}
public static void main(String args[])
{
menu1 ob=new menu1();
}
}


