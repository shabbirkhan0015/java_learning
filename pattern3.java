import java.util.*;
class pattern3
{
public static void main(String args[])
{
int i,j=1,k=1;
for(i=5;i>=1;i--)
{
for(k=1;k<=5-i;k++)
{
System.out.print(" ");
}
for(j=i;j>=1;j--)
{
System.out.print("* ");
}
System.out.println();
}
}
}