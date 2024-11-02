import java.util.*;
public class Subarray{
    public static void Subarray(int num[]){
        int lar=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<num.length;i++){
            for(int j=i;j<num.length;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    sum+=num[k];
                    if(lar<sum){
                        lar=sum;
                    }
                    if(min>sum){
                        min=sum;
                    }
                    System.out.print(num[k]+" ");
                    
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("lar is :"+lar);
        System.out.println("min is :"+min);
    }
    public static void main (String args []){
        int arr[]={1,2,3,4,5};
        Subarray(arr);

    }
}