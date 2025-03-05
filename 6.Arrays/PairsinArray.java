import java.util.*;
public class PairsinArray{

    // Method --1 
    public static void pairs(int num[]){
        int count=0;
        for(int i=0;i<num.length;i++){
            int curr=num[i];
            
            for(int j=i+1;j<num.length;j++){
                System.out.print("("+curr+","+num[j]+")");
                count++; 
            }
           // -10d = gives spaces
            System.out.printf("%-10d\n",count); 
            // To find the Number of count = n(n+1)/2;
        }
    }

    // Method --2
    public static void reversePairs(int arr[]){
    int count =0;
    for(int i=arr.length-1;i>=0;i--){
        for(int j=i-1;j>=0;j--){
            System.out.print("("+i+","+j+")");
            count++;
        }
        System.out.println();
    }
    System.out.println(count);
}
    public static void main (String[] args){
        int arr[]={1,2,3,4,5};
        pairs(arr);
    }
}
