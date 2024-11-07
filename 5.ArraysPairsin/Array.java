import java.util.*;
public class PairsinArray{
    public static void pairs(int num[]){
        int count=0;
        for(int i=0;i<num.length;i++){
            int curr=num[i];
            
            for(int j=i+1;j<num.length;j++){
                System.out.print("("+curr+","+num[j]+")");
                count++; 
            }
           
            System.out.printf("%-10d\n",count);
        }
    }
    public static void main (String args []){
        int arr[]={1,2,3,4,5};
        pairs(arr);

    }
}
