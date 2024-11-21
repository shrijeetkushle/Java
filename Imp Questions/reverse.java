import java.util.*;
public class reverse{
    public static void reverse(int num[]){
        int lar=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<num.length;i++){
            if(lar<num[i]){
                lar=num[i];
            }
            if(min>num[i]){
                min=num[i];
            }
            
    } 
    System.out.println(lar+" "+min);
}
    public static void main (String args []){
        int arr[]={1,2,3,4,5};
        reverse(arr);
    }
}
