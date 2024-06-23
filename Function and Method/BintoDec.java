import java.util.*;
public class BintoDec{
public static void main (String args []){
    Scanner sc=new Scanner (System.in);
    int n=sc.nextInt();
    int pow=0;
    int rem=0;
    while(n>0){
        int l=n%10;
        rem=rem+(l*(int)Math.pow(2,pow));
        pow++;
        n=n/10;
        }
        System.out.println(rem);
    }   
}