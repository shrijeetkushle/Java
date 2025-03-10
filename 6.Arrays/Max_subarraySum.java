import java.util.*;
public class Max_subarraySum {
    public static void BruteForce(int[] nums){
        
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    System.out.print(nums[k]);
                    sum+=nums[k];
                }
                if(sum>max){
                    max=sum;
                }
                System.out.println();
                System.out.println("Sum of subarray : "+sum);
                
            }
        }
        System.out.println("Max Subarray Sum is :"+max);
    }
    public static void main (String[] args){
        int nums[]={1,2,3,4,5};
        BruteForce(nums);
    }
}
