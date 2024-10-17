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
finally{
System.out.println("Hello People");
}
}
}

//the statement in finally block printed even though the exception not handled by the catch block
//Output-Hello people
         Arithmetic Exception
