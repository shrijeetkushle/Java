import java.util.*;
public class PrimeinRange {
    public static boolean isprime(int n){
        if(n<2){
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
            return false;
        }
    }
    return true;
}
    public static void Primerange(int n){
        for (int i=0;i<=n;i++){
            if(isprime(i)){
                System.out.print(i+" ");
            }
        }
    }
    public static void main (String[] args){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        Primeinrange(n);
    }
    sc.close();
}
