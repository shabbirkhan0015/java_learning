import java.awt.*;
import java.awt.event.*;
class shabbir13 extends Frame implements ActionListener
{
TextField t;
Button b;
shabbir13()
{
setSize(300,500);
setTitle("click event");
Panel p=new Panel();
Label l=new Label("enter name");
t=new TextField(20);
b=new Button("ok");
p.add(l);
p.add(t);
p.add(b);
add(p);
b.addActionListener(this);
show();

}
public void actionPerformed(ActionEvent e)
{
if (e.getSource()==b)
{
System.out.println("Hello " + t.getText());
//t.setText("Bye...");
t.setBackground(Color.RED);
String q=t.getText();
if(q.equals("admin"))
{
new bhar();
}
}
}
public static void main(String args[])
{
shabbir13 ob=new shabbir13();

}
}
