import java.util.*;
class twod
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a[][]=new int[10][10];
int r1,r2,i,j;
System.out.println("Enter how many rows and cols?");
r1=sc.nextInt();
r2=sc.nextInt();

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
System.out.println("transpose");
for(i=0;i<r1;i++)
{
System.out.println();
for(j=0;j<r2;j++)
{
System.out.print(a[j][i] + " ");
}
}

}


}