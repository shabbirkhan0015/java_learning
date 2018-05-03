import java.io.*;
class file3
{
public static void main(String args[])
{
try
{
File f = new File("C:/Users/Shabbir Khan/Desktop/java/cname.java");
System.out.println(f.getPath());
System.out.println(f.getTotalSpace());
new File("amit").mkdir();
// to create all directories mentioned in a path
new File("C:/Users/Shabbir Khan/Desktop/java/hir").mkdirs();
// to get all files in a folder
File folder = new File("C:/Users/Shabbir Khan/Desktop/java/");
File[] listOfFiles = folder.listFiles();
 for (int i = 0; i < listOfFiles.length; i++)
 {
        System.out.println(listOfFiles[i].getName());
    }
System.out.println("Total Files "+listOfFiles.length);

}
catch(Exception e)
{
System.out.println(e);
}
}
}