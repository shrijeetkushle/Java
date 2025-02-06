//Pattern shap
//      *   i+j=5
//    * *   i+j=6
//  * * *   i+j=7
//* * * *   i+j=8

//code
import java.util.*;
public class Bottomrighttriangle {
    public static void main (String[] args){
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter the Number :");
        int n=sc.nextInt();
        sc.close();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                //i+j>=n+1
                if(i+j>=n+1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
