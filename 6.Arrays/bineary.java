import java.util.*;
public class bineary{
    public static int Bineary(int num[],int key){
        int start=0,end=num.length-1;
        while(start<=end ){
            int mid=(start+end)/2;
            // Search for the key
        if(num[mid]==key){
            return mid;
        }
        if(num[mid]<key){
            start=mid+1;
        }
        else{
            end=mid-1;
        }
    }
    return -1;
}
    public static void main (String[] args){
        int arr[]={1,2,3,4,5};
        int key=5;
        System.out.println(linear(arr,key));
    }
}
