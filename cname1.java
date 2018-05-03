import java.util.*;
import java.io.*;
class cname1
{

public static void main(String args[])
{
try
{

//FileWriter f=new FileWriter("amit.txt");

FileOutputStream f=new FileOutputStream("amit1.txt");
f.write("hi.. this is ,my text to be write ion file...".getBytes());

f.close();
System.out.println("File created successfully");

}
catch(Exception e)
{
System.out.println("Error "+e);

}  

}

}