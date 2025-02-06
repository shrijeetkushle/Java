import java.util.*;
public class Fibonacci{
    public static void main (String args []){
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter the number of terms you want to print :");
        int n=sc.nextInt();
        sc.close();
        int first=0;
        int second=1;
        if(n==0){
            System.out.println("The Fibonacci Number is : 0");
        }
        if(n==1){
            System.out.println("The Fibonacci Number is : 1");
        }
        for(int i=2;i<=n;i++){
            int temp=first+second;
            first=second;
            second=temp;
        }
        System.out.println("The Fibonacci Number is :"+second);
        
    }
}
