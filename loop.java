class loop
{
public static void main(String a[])
{
int i,j,k;
for(i=1;i<=10;i++)
{
for(j=1;j<=15-i;j++)
{
System.out.print(" ");
}
for(k=1;k<=2*i-1;k++)
{
System.out.print("*"); 
}
System.out.println();
}
}
}
