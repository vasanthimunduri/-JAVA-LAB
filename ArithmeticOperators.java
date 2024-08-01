import java.util.*;
class Arith
{
public static void main(String args[])
{
int a;
int b;
Scanner A =new Scanner(System.in);
System.out.println("Enter a , b values");
a= A.nextInt();
b= A.nextInt();
System.out.println("addition "+(a+b));
System.out.println("subtraction "+(a-b));
System.out.println("multiplication "+(a*b));
System.out.println("division "+(a/b));
System.out.println("modulo division "+(a%b));
}
}
