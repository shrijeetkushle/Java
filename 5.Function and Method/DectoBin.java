import java.util.*;
public class DectoBin{
    public static int DectoBin(int n){
        int pow=0;
        int dec=0;
        while(n>0){
            int l=n%2;
            dec=dec+(l*(int)Math.pow(10,pow));
            n=n/2;
            pow++;
        }
        System.out.println(dec);
        return dec;
    }
    public static void main (String[] args){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        DectoBin(n);
    }
    sc.close():
}
