import java.util.*;
class sort
{
public static void main(String args[])
{
int a[]=new int[10];
int i,j,temp=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter 10 elements of array");
for(i=0;i<10;i++)
{
a[i]=sc.nextInt();
}
for(i=0;i<10;i++)
{
for(j=i+1;j<10;j++)y6\
{
if(a[i]>a[j])
{
temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}
for(i=0;i<10;i++)
{
System.out.println("sorted array"+a[i]);
}
}
}