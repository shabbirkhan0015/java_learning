import java.util.*;
class assign4
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
n=s.length();
for(i=0;i<10;i++)
{
int ch=s.charAt(i);
if(i%2==0)
{
ch=ch+1;
System.out.println(ch);
}
else
{
ch=ch-1;
System.out.println(ch);
}
}
}
}