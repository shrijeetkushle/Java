import java.util.*;
public class FactorialCalculator{
    public static int Factorial(int n){
        int fact=1;
        for (int i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println(fact);
        return fact;
    }
    public static void main (String[] args){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        Factorial(n);
    }
    sc.close();
}
