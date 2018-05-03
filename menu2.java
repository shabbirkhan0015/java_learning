import java.awt.*;
class menu2
{
menu2()
{
Frame f=new Frame("My Notepad");
f.setSize(400,450);
MenuBar mb=new MenuBar();
Menu m1, m2,m3;
MenuItem i1,i2,i3,i4;
m1=new Menu("File");
m2=new Menu("Edit");
m3=new Menu("Format");

i1=new MenuItem("Open");
i2=new MenuItem("Save");
i3=new MenuItem("Undo");
i4=new MenuItem("Font");
// set menubar at default position
f.setMenuBar(mb);
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
menu2 ob=new menu2();
}
}


