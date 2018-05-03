import java.util.*;
class x
{
private int a;
public void myfn()
{
Scanner sc=new Scanner(System.in);
System.out.println("enter OTP code");
a=sc.nextInt();
System.out.println("Value is " +a);
}
class y
{
public static void main(String args[])
{
x ob=new x();
ob.myfn();
}
}
}
