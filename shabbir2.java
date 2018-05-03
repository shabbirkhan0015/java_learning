import java.awt.*;
import javax.swing.*;
class shabbir2
{
public static void main(String args[])
{
JFrame f=new JFrame("My spinner ");
f.setSize(300,400);
SpinnerModel value =new SpinnerNumberModel(5,0,10,1); 
JSpinner spinner = new JSpinner(value);   
spinner.setBounds(100,100,50,30);    
f.add(spinner); 
f.setSize(300,300);    
f.setLayout(null);    
f.setVisible(true);     
}  
}  