import java.util.*;
public class reversegivennumber {
    public static void main (String  args []){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int rev=0;
        for (int i=0;n>0;i++){
            i=n%10;
            rev=(rev*10)+i;
            n=n/10;
        }
        System.out.print(rev);
    }
}
