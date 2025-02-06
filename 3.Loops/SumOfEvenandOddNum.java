import java.util.*;
public class SumOfEvenandOddNum {
    public static void main (String[] args){
        Scanner sc=new Scanner (System.in);
        int index;
        int sumofEven=0;
        int sumofOdd=0;
        do{
            System.out.print("Enter the number :");
            int n=sc.nextInt();
            if(n%2==0){
                sumofEven+=n;
            }
            else{
                sumofOdd+=n;
            }
            System.out.print("enter 0 to stop 1 to continue :");
            index=sc.nextInt();
        }while(index==1);
            System.out.println("sum of Even Numner is :"+sumofEven);
            System.out.println("sum of odd Number is :"+sumofOdd);
        }
    }
