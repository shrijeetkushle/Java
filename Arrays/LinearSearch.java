import java.util.*;
public class LinearSearch{
    public static int LenearSearch(int arr[],int key){
        for (int i=1;i<=arr.length;i++){
            if(arr[i]==key){
                return i;

            }
        }
        return -1;
    }
    public static void main (String args []){
        int arr[]={1,2,3,4,5};
        int key=4;
        int index=LenearSearch(arr,key);
        if(index==-1){
            System.out.println("Not Found");
        }
        else{
            System.out.println(index);
        }
    }
}       
            