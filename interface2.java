/*
As we already know that interface can have only function declaration but not defination for the same we create class and extends this to class for define functions of interface. 

introducing interface with no function ( marker interface) question arise why we are creating if interface doesn't contain anything??

right basically we want to add permission before calling the function of any class.  as when we create the object of class implements with interface an object is shared to both.

*/
interface P
{
}
class interface2 implements P
{
public void show()
{
System.out.println("You can cal this function only if you have implements interface to this class.");
}
public static void main(String args[])
{
interface2 ob =new interface2();
if (ob instanceof  P)
ob.show();
else
System.out.println("Permission denied as p is not point with class");
}
}