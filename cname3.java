import java.io.*;
class cname3
{

public static void main(String args[])
{
try
{
FileWriter f=new FileWriter("shabbir.txt");
String x="my is shabbir khan";
f.write(x);
{
System.out.println("succesfully created");
}
f.close();
}  
catch(Exception e)
{
System.out.println(e);
}
}
}