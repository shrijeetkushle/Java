import java.util.*;
public class Armstrong{
    public static int Sumofpow(int n,int d){
        int sum=0;
        while(n!=0){
            int last=n%10;
            sum+=Math.pow(last,d);
            n=n/10;
        }
        return sum;
    }
    public static void main (String[] args){
        Scanner sc=new Scanner (System.in);
        System.out.print(" Enter the number : ");
        int n=sc.nextInt();
        int digits=String.valueOf(n).length();
        if(Sumofpow(n,digits)==n){
            System.out.println("Armstrong Number");
        }
        else{
            System.out.println("Not an Armstrong number");
        }
    }
}
