import java.util.*;
class  assign1
{
public static void main(String args[])
{
int i=0;
String rev="";
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
int n=s.length();
for(i=n-1;i>=0;i--)
{
rev= rev+s.charAt(i);
}
if(s.equals(rev))
{
System.out.println("its a palindrome");
}
else
{
System.out.println("its not a palindrome");
}
} 
}