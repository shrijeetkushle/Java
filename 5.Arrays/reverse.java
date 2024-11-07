import java.util.*;
public class reverse{
    public static void reverse(int num[]){
        int start=0,end=num.length-1;
        while(start<end){
            int temp=num[end];
            num[end]=num[start];
            num[start]=temp;
            start++;
            end--;
        }
    }
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main (String args []){
        int arr[]={1,2,3,4,5};
        reverse(arr);
        print(arr);
    }
}
