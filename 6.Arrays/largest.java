import java.util.*;
public class Largest{
    public static void largest(int num[]){
        int lar=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<num.length;i++){
            // max value=-2147483647
            if(lar<num[i]){
                lar=num[i];
            }
           // min value=2147483647
            if(min>num[i]){
                min=num[i];
            }
    }   
    System.out.println(lar+" "+min);
}
    public static void main (String[] args){
        int arr[]={1,2,3,4,5};
        largest(arr);
    }
}
