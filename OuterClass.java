//inner class can access any variable, function either its private of outer class. the same applied // also on outer class
class OuterClass
 {
private int i = 9;
 
// Creating instance of inner class and calling inner class function
public OuterClass()
 {
System.out.println("constructor outer");
inner1 i1 = new inner1();
i1.sum();
}
 
class inner1
 {
public inner1()
{
System.out.println("const inner");
}
public void sum()
 {
// using private variable from outer class
System.out.println("value  is" + i);
}
}
public static void main(String args[])
{
//OuterClass ob=new OuterClass();
//ob.inner1 ob1=new inner1();

OuterClass.inner1 ob =new OuterClass().new inner1();
//ob.sum();
}
}