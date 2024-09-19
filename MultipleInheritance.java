import java.util.*;
class Parent
{
  public void methodA()
    {
    System.out.println("parent class");
    }
}
class child1 extends Parent
{
public void methodB()
{
System.out.println("child class");
}
}
class child2 extends child1
 {
 public void methodC()
 {
 System.out.println("child1 class as a parent to child2");
 }
 
 public static void main(String args[])
 {
 child2 obj=new child2();
 obj.methodA();
 obj.methodB();
 obj.methodC();
 }
 }
