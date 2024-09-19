import java.util.*;
class A
{
int s=100;
}
class B extends A
{
 int s=200;
 void Display()
 {
 System.out.println("the value in child class :"+s);
 System.out.println("the value in parent class :"+super.s);
 }
 public static void main(String args[])
 {
 B obj = new B();
 obj.Display();
 }
 }
 
 
