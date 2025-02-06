// pattern shape
// ****
// *  *
// *  *
// ****

//code
import java.util.*;
public class Hollow_Square {
    public static void main (String[] args){
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter the Number :");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1 || j==1 || i==n || j==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
