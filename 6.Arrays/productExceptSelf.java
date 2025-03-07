import java.util.*;
public class productExceptSelf {
    public static int[] product_ExceptSelf(int[] nums){
        int n=nums.length;
        int ans[]=new int[n];
        for(int i=0;i<n;i++){
            int product=1;
            for(int j=0;j<n;j++){
                if(j!=i){
                product*=nums[j];
                }
            }
            ans[i]=product;
        }
        return ans;
    }
    public static void main (String[] args){
        int nums[]={1,2,3,4};
        int ans[]=product_ExceptSelf(nums);

        // Printing arrys
        for(int i=0;i<nums.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
