import java.util.*;
class MultiCatch
{
public static void main(String args[])
{
try {
int a[]=new int[5];
System.out.println(a[10]);
}
catch(ArithmeticException ae)
{
System.out.println("Arithmetic Exception");
}
catch(ArrayIndexOutOfBoundsException ai)
{
System.out.println("Out of Bounds Exception");
}
catch(Exception e)
{
System.out.println(e);
}
}
}
