import java.util.*;
public class MinMaxarray{
    // Method --1
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


    // Method --2
    public static void Pairs(int arr[]){
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                    sum+=arr[k];
                }
                System.out.print("Sum is:"+sum);
                System.out.println();
                if(sum<min){
                    min=sum;
                }
                if(sum>max){
                    max=sum;
                }
            }
            System.out.println();
        }
        System.out.println("Min Value is : "+min);
            System.out.println("Max Value is : "+max);
    }
    public static void main (String args []){
        int arr[]={1,2,3,4,5};
        Subarray(arr);

    }
}
