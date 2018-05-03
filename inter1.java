import java.util.*;
interface a
{
public void shabbir();
}
class inter1 implements a
{
public void shabbir()
{
Scanner sc=new Scanner(System.in);
int b=0,c=0;
b=sc.nextInt();
c=sc.nextInt();
System.out.println(b*c);
}
public static void main(String args[])
{

inter1 ob=new inter1();
ob.shabbir();
}
}