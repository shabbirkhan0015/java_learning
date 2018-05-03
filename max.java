import java.util.*;
class max
{
public static void main(String args[])
{
int a[]=new int[10];
int i,max=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter 10 elments of array");
for(i=0;i<10;i++)
{
a[i]=sc.nextInt();
}
max=a[0];
for(i=0;i<10;i++)
{
if(a[i]>max)
{
max=a[i];
}
}
System.out.println("max is "+max);
}
}
