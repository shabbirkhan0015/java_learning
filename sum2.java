import java.util.*;
class sum2
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a[][]=new int[10][10];
int r1,r2,i,j,sum=0,d1=0,d2=0;
System.out.println("Enter how many rows and cols?");
r1=sc.nextInt();
r2=sc.nextInt();
System.out.println("enter elements ");
for(i=0;i<r1;i++)
{
for(j=0;j<r2;j++)
{
a[i][j]=sc.nextInt();
}
}
System.out.println("displaying matrix");

for(i=0;i<r1;i++)
{
System.out.println();
for(j=0;j<r2;j++)
{
System.out.print(a[i][j] + " ");
}
}
System.out.println("sum of elements of matrix");

for(i=0;i<r1;i++)
{
System.out.println();
for(j=0;j<r2;j++)
{
sum=sum+a[i][j];

}
}
System.out.print(sum);
System.out.println("the diagonal sum");

for(i=0;i<r1;i++)
{
System.out.println();
for(i=0,j=0;i<r1;i++,j++)
{
d1=d1+a[i][j];
}
}
for(i=0,j=r2-1;i<r1;i++,j--)
{
d2=d2+a[i][j];
}

System.out.print(d1 + " " +d2);
}
}
