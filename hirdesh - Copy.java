import java.awt.*;

class hirdesh extends Frame
{

hirdesh()
{
// creating Frame and control classes
Panel p=new Panel();
Label l=new Label("Enter Name");
TextField t=new TextField(15);
Button b=new Button("OK");

b.setBackground(Color.RED);
l.setForeground(Color.RED);

setSize(400,300);
setTitle("My Window");
setBackground(Color.BLUE);

// adding elements to the Panel
p.add(l);
p.add(t);
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
