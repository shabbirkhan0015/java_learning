import java.awt.*;
import java.awt.event.*;
class bhar extends Frame implements MouseListener
{
Button b;
Label l;
TextField t;
bhar()
{
setSize(300,300);
setTitle("Hirdesh Bhardwaj");
setLayout(null);
setVisible(true);
b =new Button("Hum Tum");
l =new Label("Name");
t =new TextField();
l.setBounds(20,40,50,30);
b.setBounds(30,80,100,50);
t.setBounds(40,40,100,25);
b.addMouseListener(this);
add(l);
add(b);
add(t);
show();
}
public void mouseClicked(MouseEvent e)
{
if(e.getSource()==b)
{
t.setBackground(Color.RED);
t.setText("         hirdesh");
//dispose();
}
}
public void mousePressed(MouseEvent e)
{
if(e.getSource()==b)
{
t.setBackground(Color.BLUE);
t.setText("        hirdesh");
//dispose();
}
}
public void mouseReleased(MouseEvent e)
{
if(e.getSource()==b)
{
t.setBackground(Color.YELLOW);
t.setText("           hirdesh");
//dispose();
}
}
public void mouseEntered(MouseEvent e)
{
if(e.getSource()==b)
{
t.setBackground(Color.ORANGE);
t.setText("          KKG");
//dispose();
}
}
public void mouseExited(MouseEvent e)
{
if(e.getSource()==b)
{
t.setBackground(Color.BLACK);
t.setText("         Kamal");
//dispose();
}
}
public static void main(String args[])
{
bhar b1 =new bhar();
}
}