import java.util.*;
class heart
{
public static void main(String args[])
{
int i,j=1,k=1;
for(i=1;i<=5;i++)
{
for(j=1;j<=5;j++)
{
if((i==1 && j==3)||(i==4 && j==1)||(i==5 && j==1)||(i==5 && j==2)||(i==5 && j==4)||(i==5 && j==5)||(i==4 && j==5) )
{
System.out.print("  ");
}
else
{
System.out.print("* ");
}
}
System.out.println();
}
}
}
