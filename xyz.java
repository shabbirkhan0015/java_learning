abstract class hirdesh
{
abstract void myfunction();

public void fn2()
{
System.out.println("hello i am in fn 2");
}
}

class xyz extends hirdesh
{

public void sum1()
{
System.out.println("hello i am in fn sum");

}

public void myfunction()
{
System.out.println("hello i am in fn myfunction");
}

public static void main(String args[])
{
hirdesh ob=new xyz();
xyz ob2=new xyz();
ob2.sum1();
ob.myfunction();
ob.fn2();

}


}

