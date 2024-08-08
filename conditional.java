import java.util.*;
class Condi
{
public static void main(String args[])
{
int a;
int b;
Scanner A =new Scanner(System.in);
System.out.println("Enter a , b values");
a= A.nextInt();
b= A.nextInt();
int max=(a>b)?a:b;
System.out.println("Maximum = "+max);
}
}
