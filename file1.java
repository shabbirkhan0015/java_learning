import java.io.*;
class file1
{
public static void main(String args[])
{
try
{
FileInputStream fis=new FileInputStream("carea.java");
int i;
while((i=fis.read())!=-1)
{
System.out.print((char)i);
}
fis.close();
}
catch(Exception e)
{
System.out.println(e);
}
}
}