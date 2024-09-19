import java.util.*;
class Vehicle 
{
int speedkm=80;
void run()
{
System.out.println("vehicle is running at speed :"+speedkm);
}
}
class Bike extends Vehicle
{
void run()
{
System.out.println("Bike is running at speed :"+speedkm);
}
public static void main(String args[])
{
Bike b=new Bike();
b.run();
}
}

