interface inter
{
public void hirdesh();
}
class myclass implements inter
{

public void hirdesh()
{
System.out.println("the defination of hirdesh function goes here");

}
public static void main(String args[])
{
myclass ob=new myclass();
ob.hirdesh();
}
}