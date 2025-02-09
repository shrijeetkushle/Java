import java.util.*;
public class Binomial_Coefficient {
    public static int Factorial(int n){
        int fact=1;
        for(int i=n;i>=1;i--){
            fact*=i;
        }
        return fact;
    }
    public static void calculateBinomialCoefficient(int n1, int r1){
        int n=Factorial(n1);
        int r=Factorial(r1);
        int n_r=Factorial(n1-r1);
        int factorial=n/(r*n_r);
        System.out.println(factorial);
    }
    public static void main (String[] args){
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter the Value of n :");
        int n=sc.nextInt();
        System.out.print("Enter the Value of r :");
        int r=sc.nextInt();
        calculateBinomialCoefficient(n, r);
    }
}
