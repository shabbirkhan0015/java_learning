import java.awt.*;
import java.applet.*;
import java.net.*;
/*
  <applet code= face width=400 height=400>
  </applet>
*/

public class face extends Applet 
{
 public void paint(Graphics g) 
{
   g.drawString("Code base =" + getCodeBase(),10,10);
   g.drawString("Document base =" + getDocumentBase(),10,20);
   g.drawOval(40,40,120,150);
   g.drawOval(57,75,30,20);
   g.drawOval(110,75,30,20);
g.setColor(Color.red);
   g.fillOval(68,81,10,10);
  g.setColor(Color.blue);
   g.fillOval(121,81,10,10);
   g.drawOval(85,100,30,30);
   g.fillArc(60,125,80,40,180,180);
   g.drawOval(25,92,15,30);
   g.drawOval(160,92,15,30);
 
   URL url = getCodeBase();
   String msg = "CLass File Location : " + url + " ," ;
   url = getDocumentBase();
   msg = msg + "HTML File location :"+ getDocumentBase();
   showStatus(msg);
 }
}
