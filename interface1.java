/*
class functions can be decared, defined both but interface methods can only decare same as abstract method. to define interface method we having another class by implements  to interface.

Note when you are inherit class from class is extends and when class inherit from interface called implements

*/
interface A
{
// default access specifier for interface method is public
public void show();
}
class interface1 implements A
{
public void show()
{
System.out.println("I am defining interface method here");
}
public void myfn()
{
System.out.println("I am defining new function of class B. the same object will use to call both functions here");
}
public static void main(String args[])
{
interface1 ob =new interface1();
ob.show();
ob.myfn();
}
}