import java.util.*;
class shabbir6
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a[]=new int[10],i=0,j=0,n=0,p=0;
for(i=0;i<10;i++)
{
a[i]=sc.nextInt();
}
System.out.println("enter the position from where you want to delete");
p=sc.nextInt();
for(i=p;i<10;i++)
{
a[i]=a[i-1];
}
for(i=0;i<9;i++)
{
System.out.println(a[i]);
}
}
}
