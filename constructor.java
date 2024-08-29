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

