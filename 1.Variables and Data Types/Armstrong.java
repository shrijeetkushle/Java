import java.util.*;
public class Armstrong{
    public static void main (String args []){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int sum=0;
        while(n!=0){
            int last=n%10;
            int cub=(int)Math.pow(last,3);
            sum+=cub;
            n=n/10;
        }
        System.out.println(sum);
    }
}