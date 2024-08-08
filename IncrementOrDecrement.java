import java.util.*;
class InDc
{
public static void main(String args[])
{
int a;
int b;
Scanner A =new Scanner(System.in);
System.out.println("Enter a , b values");
a= A.nextInt();
b= A.nextInt();
System.out.println("post increment of a "+(a++));
System.out.println("The value of a "+a);
System.out.println("pre increment of a "+(++a));
System.out.println("post increment of b "+(b--));
System.out.println("The value of b "+b);
System.out.println("pre increment of b "+(--b));
}
}
