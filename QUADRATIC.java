import java .util.*;
class Quadratic
{
   public static void main(String []args)
   {
     float a;
     float b;
     float c;
     float d;
     double x1;
     double x2;
     Scanner sc=new Scanner(System.in);
     System.out.println("enter a,b,c values ");
     a=sc.nextFloat();
     b=sc.nextFloat();
     c=sc.nextFloat();
     d=(b*b)-4*a*c;
     if(d>0)
     {
      x1=(-b+Math.sqrt(d))/(2*a);
      x2=(-b-Math.sqrt(d))/(2*a);
      System.out.println("the roots are " +x1 + "," + x2);
      System.out.println("The roots are real and distinct");
     }
     else if(d==0)
     {
     x1=x2=(-b)/(2*a);
     System.out.println("the roots are " +x1 +"," + x2);
     System.out.println("the roots are real and equal");
     }
     else
     {
     System.out.println("the roots are imaginary");
     }
  }
}
