import java.util.*;
class constructor
{
String name;
int num;
constructor()
{
name="hi";
num=40;
}
constructor(String s,int n)
{
name=s;
num=n;
System.out.println(name+" "+num);
}
public static void main(String []args)
{
constructor o1=new constructor();
constructor o2=new constructor("hello",10);
System.out.println(o1.name);
System.out.println(o1.num);
}
}


//overloading
import java.util.*;
class over
{
over()
{
System.out.println("Default constructor");
}
over(int n)
{
System.out.println("value of n is "+n);
}
public static void main(String agrs[])
{
over ob1=new over();
over ob2=new over(7);
}
}
