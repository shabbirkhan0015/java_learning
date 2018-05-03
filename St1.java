import java.util.*;
class st1
{
public static void main(String arg[])
{
int i=0;
Scanner sc=new Scanner(System.in);
String[] input=new String[12];
System.out.println("enter the string");
for(i=0;i<12;i++)
{
input[i]=sc.nextLine();
}
System.out.println("your input string is");
for(i=0;i<12;i++)
{
System.out.println(input[i]);
}
}
}