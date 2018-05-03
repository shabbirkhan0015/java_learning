import javax.swing.*;
class tabbed
{
public static void main(String args[])
{
JFrame f=new JFrame("Tabbed");
f.setSize(400,400);
 JTabbedPane tab = new JTabbedPane();
 JButton b1 = new JButton("this is introduction data for home page.... this is introduction data for home page.... this is introduction data for home page.... this is introduction data for home page....this is introduction data for home page.... this is introduction data for home page....this is introduction data for home page.... this is introduction data for home page....this is introduction data for home page.... this is introduction data for home page....this is introduction data for home page.... this is introduction data for home page....this is introduction data for home page.... this is introduction data for home page....");
  tab.add("Home", b1);
JButton b2 = new JButton("Sector 5 Gurgaon Call : 3475674675264 Sector 5 Gurgaon Call : 3475674675264 Sector 5 Gurgaon Call : 3475674675264 Sector 5 Gurgaon Call : 3475674675264 Sector 5 Gurgaon Call : 3475674675264 Sector 5 Gurgaon Call : 3475674675264Sector 5 Gurgaon Call : 3475674675264");
  tab.add("Contact", b2);
JButton b3 = new JButton("sjdsfhhjsdhgjhfdjghfj.");
  tab.add("Security", b3);
f.add(tab);
f.setVisible(true);
}
}
