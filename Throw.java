//User Defined Exception Using Throw

import java.util.*;
public class Throw
{
public static void Validate(int age){
if(age<18)
{
throw new ArithmeticException("Not Eligible to vote");
}
else{
System.out.println("Eligible to vote");
}
}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter your Age");
int Age=sc.nextInt();
Validate(Age);
}
}
/*Output-Enter your Age
        18
        Eligible to Vote

         Enter your Age
         13
         java.lang.ArithmeticException:Not Eligible To Vote */
  
