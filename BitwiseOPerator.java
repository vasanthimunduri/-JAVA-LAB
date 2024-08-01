import java.util.*;
class Bitwise
{
public static void main(String args[])
{
int a;
int b;
Scanner A =new Scanner(System.in);
System.out.println("Enter a , b values");
a= A.nextInt();
b= A.nextInt();
System.out.println((a|b));
System.out.println((a&b));
System.out.println((a^b));
System.out.println((~a));
System.out.println((a<<1));
System.out.println((a<<2));
System.out.println((b>>1));
System.out.println((b>>2));
}
}
