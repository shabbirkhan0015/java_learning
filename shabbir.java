import java.util.*;
class shabbir
{
public static void main(String args[])
{
int a=0,a1=0,t=0;
double d1=0,d2=0;
Scanner sc=new Scanner(System.in);
System.out.println("amount of mill cloth purchased");
a=sc.nextInt();
System.out.println("amount of handlooms items purchased");
a1=sc.nextInt();
t=a+a1;
if(t<=100)
{
d1=0*a;
d2=0.05*a1;
}
else if((t>100) && (t<=200))
{
d1=0.05*a;
d2=0.075*a1;
}
else if((t>200) && (t<=300))
{
d1=0.075*a;
d2=0.1*a1;
}
else 
{
d1=0.1*a;
d2=0.15*a1;
}
System.out.println((a-d1)+(a1-d2));
}
}