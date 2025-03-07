import java.util.*;
public class MajorityElement {
    public static int Majority_element(int[] nums){
        int maj=nums[0];
        int lead=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==maj){
                lead++;
            }
            else if (lead>0){
                lead--;
            }
            else{
                maj=nums[i];
                lead=1;
            }
        }
        return maj;
    }
    public static void main (String[] args){
        int nums[]={1,1,2,2};
        System.out.println(Majority_element(nums));
    }
}
