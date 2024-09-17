import java.util.*;
public class BintoDec{
    public static int BintoDec(int n){
        int pow=0;
        int dec=0;
        while(n>0){
            int l=n%10;
            dec=dec+(l*(int)Math.pow(2,pow));
            n=n/10;
            pow++;
        }
        System.out.println(dec);
        return dec;
    }
    public static void main (String args []){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        BintoDec(n);
    }
}