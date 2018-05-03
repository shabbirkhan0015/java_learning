/*
  <applet code="applet3.class" width=300 height=300></applet>
*/
import java.util.*;
import java.applet.*;
import java.awt.*;

public class applet3 extends Applet
{    
Scanner sc=new Scanner(System.in);
int a=0,b=0,c=0;
     String output = "";
     String event;

     public void init()
     {
          event = "Initializing...";
          System.out.println("enter two numbers");
          a=sc.nextInt();
          b=sc.nextInt();
	  printOutput();
     }

     public void start()
     {
          event = "Starting..."; 
          c=a+b;
          
	  printOutput();
     }

     public void stop()
     {
          event = "Stopping...";
        System.out.println("your sum is"+c);
         System.out.println("thank you");
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
