import java.util.*;
class Bubble
{
static void BubbleSort(int arr[])
{
int n=arr.length;
int temp=0;
for (int i=0;i<n;i++)
{
 for(int j=1;j<(n-i);j++)
 {
    if(arr[j-1]>arr[j])
    {
    temp=arr[j-1];
    arr[j-1]=arr[j];
    arr[j]=temp;
    }
 }
}
}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter size of array");
int n=sc.nextInt();
int arr[]=new int[n];
System.out.printf("enter %d elements",n);
for(int i=0;i<n;i++){
arr[i]=sc.nextInt();
}
System.out.println("Before Bubble sort");
for(int k=0;k<n;k++){
 System.out.print(arr[k]+" ");
}
BubbleSort(arr);
System.out.println("\nAfter Bubble sort");
for(int j=0;j<n;j++){
 System.out.print(arr[j]+" ");
 }
 }
 }



