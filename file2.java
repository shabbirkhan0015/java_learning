import java.io.*;
class file2
{
public static void main(String args[])
{
try
{
FileWriter fw=new FileWriter("hirdesh.txt");
/* You may use PrintWriter Class for the same..
 when using FileOutputStream you need to use at the time of print 
 txt.getBytes() method  i.e fw.write(txt.getBytes()); 
*/
String txt="Hi this line will be add in hirdesh.txt file";
fw.write(txt);
System.out.println("Data Write successfully");
fw.close();
}
catch(Exception e)
{
System.out.println(e);
}
}
}


/*
Major Differences :

FileWriter throws IOException in case of any IO failure but PrintWriter not
PrintWriter automatically invokes flush after every byte of data is written. In case of FileWriter, caller has to take care of invoking flush.

*/