import java.util.*;
class Binary
{
public static void Binarysearch(int arr[],int first,int last,int key)
{
int mid=(first+last)/2;
while (first<=last){
if(arr[mid]<key){
first=mid+1;
}
else if(arr[mid]==key){
System.out.println("element fount at index:"+mid);
break;
}
else{
last=mid-1;
}
mid=(first+last)/2;
}
if(first>last){
System.out.println("element is not found");
}
}
public static void main(String args[]){
int arr[]={1,2,3,4,5,6,7,8};
int key=6;
int last=arr.length-1;
Binarysearch(arr,0,last,key);
}
}
