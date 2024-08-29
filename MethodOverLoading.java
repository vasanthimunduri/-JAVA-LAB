import java.util.*;
class Program1
{
void mul(int a,int b)
{
System.out.println(a*b);
}
void mul(int a,int b, int c)
{
System.out.println(a*b*c);
}
public static void main(String args[])
{
Program obj=new Program();
obj.mul(2,6);
obj.mul(2,6,9);
}
} 
