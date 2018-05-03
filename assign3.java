import java.util.*;
class assign3
{
public static void main(String args[])
{
int i=0;
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
int n=s.length();
for(i=0;i<n;i++)
{
char ch=s.charAt(i);
if(Character.isUpperCase(s.charAt(i)))
{
ch=Character.toLowerCase(ch);
System.out.print(ch);
}
else if(Character.isLowerCase(s.charAt(i)))
{
ch=Character.toUpperCase(ch);
System.out.print(ch);
}
}
}
}