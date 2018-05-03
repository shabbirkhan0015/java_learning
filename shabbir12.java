import java.awt.*;
import java.event.*;
class shabbir12 extends frame implements actionListener
{
Textfield t=new Textfield(20);
shabbir12()
{
setSize(300,500);
setTitle("click event");
Panel p=new Panel();
Label l=new Lable("enter name");
Textfield t=new Textfield(20);
Button b=new Button("ok");
p.add(l);
p.add(t);
p.add(b);
add(p);
b.addactionListener(this);
}
public void actionPerformed(actionEvent e)
{
if(e.getSource()==b)
{
System.out.println("hello"+t.getText());
}
}
}
public static void main(String args[])
{
shabbir12 ob=new shabbir12();
ob.shabbir12();
}
