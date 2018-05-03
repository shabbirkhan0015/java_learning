import java.util.*;

class ex
{
public static void main(String ar[]){

int age=0;
Scanner sc = new Scanner(System.in);
age=sc.nextInt();
try
{
if(age>100)
throw new Exception("age invalid sorry u can not take services");
}
catch(Exception e)
{
System.out.println("error " + e);
}
System.out.println("u entered "+age);
}
}
