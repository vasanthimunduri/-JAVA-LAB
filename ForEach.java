//printing elements
import java.util.*;
class For
{
public static void main(String args[])
{
int arr[]={10,11,12,13};
System.out.println("The Elements are: ");
for(int i:arr){
System.out.println(i);
}
}
}


//printing total of elements 
import java.util.*;
class For
{
public static void main(String args[])
{
int arr[]={10,11,12,13};
int total=0;
System.out.println("The Elements are: ");
for(int i:arr){
System.out.println(i);
 total += i;
}
System.out.println("The total is: "+total);
}
}
