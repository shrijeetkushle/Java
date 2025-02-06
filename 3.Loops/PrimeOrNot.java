import java.util.*;
public class PrimeOrNot {
    public static void main (String[] args){
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter the Number :");
        int n=sc.nextInt();
        if(n<=1){
            System.out.println("Not Prime");
            return;
        }
        if(n==2){
            System.out.println("Prime");
            return;
        }
            boolean isprime=true;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                isprime=false;
                break;
            }
        }
        if(isprime==true){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not prime");
        }
    }
}
