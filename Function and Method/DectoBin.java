import java.util.*;
public class DectoBin{
public static void main (String args []){
    Scanner sc=new Scanner (System.in);
    int n=sc.nextInt();
    int pow=0;
    int rem=0;
    while(n>0){
        int l=n%2;
        rem=rem+(l*(int)Math.pow(10,pow));
        pow++;
        n=n/2;
        }
        System.out.println(rem);
    }   
}