import java.util.*;
class Switch
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter Character");
char ch=sc.next().charAt(0);
switch(ch){
case 'A':
case 'a':
case 'E':
case 'e':
case 'I':
case 'i':
case 'O':
case 'o':
case 'U':
case 'u':
System.out.println("Vowel");
break;
default:
System.out.println("Consonant");
}
}
}
