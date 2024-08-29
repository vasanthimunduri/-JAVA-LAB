import java.util.*;
class Program
{
  static void display()
  {
  System.out.println("static method");
  }
  int add(int a,int b)
  {
  return (a+b);
  }
  public static void main(String args[])
  {
  display();
  Program Pro =new Program();
  int sum=Pro.add(11,8);
  System.out.println("Addition:"+sum);
  }
  }
  
