import java.util.*;
class Logical
{
public static void main(String args[])
{
int a;
int b;
int c;
Scanner A =new Scanner(System.in);
System.out.println("Enter a , b , c values");
a= A.nextInt();
b= A.nextInt();
c= A.nextInt();
System.out.println((a>b)&&(b>c));
System.out.println((a<b)||(b==c));
System.out.println((a==c)||!(b==c));
System.out.println(!(a<=b));
}
}
