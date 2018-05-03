import java.awt.*;

class hirdesh extends Frame
{

hirdesh()
{
// creating Frame and control classes
Panel p=new Panel();
Label l=new Label("Enter Name");
TextField t=new TextField(15);

Checkbox cb=new Checkbox("Indian");
Button b=new Button("submit");

Choice c=new Choice();
c.addItem("Delhi");
c.addItem("Kolkata");
c.addItem("Bhiwani");
c.addItem("Gurgoan");
c.addItem("Hisar");
c.addItem("kkr");


b.setBackground(Color.RED);
l.setForeground(Color.RED);

setSize(400,300);
setTitle("My Window");
setBackground(Color.BLUE);

// adding elements to the Panel
p.add(l);
p.add(t);
p.add(c);
p.add(cb);
p.add(b);
// now add panel to frame
add(p);

show();

}
public static void main(String args[])
{
hirdesh ob=new hirdesh();

}
}














