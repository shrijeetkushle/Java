import java.util.*;
public class reverseofnumber {
    public static void main (String []args){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        for (int i=1;n>0;i++){
            i=n%10;
            System.out.print(i);
            n=n/10;
        }
    }
}
