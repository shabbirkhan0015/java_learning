/*
  <applet code="applet2.class" width=300 height=300></applet>
*/

import java.applet.*;
import java.awt.*;

public class applet2 extends Applet
{
     String output = "";
     String event;

     public void init()
     {
          event = "Initializing...";
	  printOutput();
     }

     public void start()
     {
          event = "Starting..."; 
	  printOutput();
     }

     public void stop()
     {
          event = "Stopping...";
	  printOutput();
     }

     public void destroy()
     {
          event = "Destroying...";
	  printOutput();
     }

     private void printOutput()
     {
          System.out.println(event);
	  output += event;
          System.out.println(output);
	  repaint();
     }

     public void paint(Graphics g)
     {
       g.drawString(output, 10, 10);
     }

}
