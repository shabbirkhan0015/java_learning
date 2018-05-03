import java.util.*;
class abc3
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a[]=new int[6],i=0,m=0,n=0;
System.out.println("enter marks");
for(i=0;i<6;i++)
{
a[i]=sc.nextInt();
if(a[i]>81)
{
m++;
}
if(a[i]<=80 && a[i]>61)
{
n++;
}
}
System.out.println(m);
System.out.println(n);
}
}