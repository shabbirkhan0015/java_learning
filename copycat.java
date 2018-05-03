import java.awt.*;
class copycat  extends Frame
{
public copycat()
{
Panel p=new Panel();
Label l=new Label("enter name");
TextField t=new TextField(15);
Button b=new Button("ok");
b.setBackground(Color.GREEN);
l.setForeground(Color.PINK);
setSize(200,300);
Choice c=new Choice();
c.addItem("Delhi");
c.addItem("Gurgaon");
c.addItem("Bhiwani");
c.addItem("Kkr");
c.addItem("Hisar");
c.addItem("Chandigarh");
setTitle("My Window");
setBackground(Color.BLUE);
p.add(l);
p.add(t);
p.add(c);
p.add(c);
add(p);
show();
}

public static void main(String args[])
{
copycat ob=new copycat();
}
}