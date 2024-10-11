import java.util.*;
public class Palindrome
{
    public static boolean reverse(int n){
        int p=n;
        int rev=0;
        while(p>0){
            int l=p%10;
            rev=rev*10+l;
            p=p/10;
        }
        return rev==n;
    }
    public static void main (String args []){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        if(reverse(n)){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}